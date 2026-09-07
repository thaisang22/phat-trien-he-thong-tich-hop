
import java.io.File;

public class DeleteFile {
    private void deleteFile(String filePath) {
        File file = new File(filePath);
        if(file.exists()) {
            System.out.println("file co ton tai");
            file.delete();
            System.out.println("da xoa file nay");
        } else {
            System.out.println("file ko ton tai");   
        }
    }
    public static void main(String[] agrs) {
        String filePath = "D:\\IUHCNTT\\IUHHK3\\kientructichhophethong\\test1.txt";
        DeleteFile deleteFile = new DeleteFile();
        deleteFile.deleteFile(filePath);
    }
}
