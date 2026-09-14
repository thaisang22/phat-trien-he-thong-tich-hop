import java.io.*;
import java.net.Socket;

public class TCPEchoClient {
    public static final String SERVER_IP = "127.0.0.1";
    public static final int SERVER_PORT = 9999;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_IP, SERVER_PORT);
             InputStream is = socket.getInputStream();
             OutputStream os = socket.getOutputStream()) {
            
            System.out.println("Client đã được tạo");

            for (int i = '0'; i <= '9'; i++) {
                os.write(i);
                int ch = is.read();
                System.out.println((char) ch);
                Thread.sleep(2000);
            }
        } catch (IOException e) {
            System.out.println("Error: Can NOT create socket");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread was interrupted");
        }
    }
}