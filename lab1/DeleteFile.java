
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFile {
    public boolean deleteFile(String filePath) {
        Path path = Path.of(filePath);
        if (!Files.isRegularFile(path)) {
            System.out.println("Tep khong ton tai: " + path);
            return false;
        }

        try {
            Files.delete(path);
            System.out.println("Da xoa tep: " + path);
            return true;
        } catch (IOException exception) {
            System.out.println("Khong the xoa tep: " + exception.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Su dung: java DeleteFile <duong-dan-tep>");
            return;
        }
        DeleteFile deleteFile = new DeleteFile();
        deleteFile.deleteFile(args[0]);
    }
}
