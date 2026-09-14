import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class RequestProcessing extends Thread {
    private final Socket channel;

    public RequestProcessing(Socket socket) {
        this.channel = socket;
    }

    @Override
    public void run() {
        try (Socket s = channel;
             OutputStream os = s.getOutputStream();
             InputStream is = s.getInputStream()) {
            
            int n;
            while ((n = is.read()) != -1) {
                os.write(n);
            }
        } catch (IOException e) {
            System.out.println("Request Processing Error: " + e.getMessage());
        }
    }
}