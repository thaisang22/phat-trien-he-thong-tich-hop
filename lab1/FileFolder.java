import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class FileFolder {

    public static void taoThuMuc(Path thuMuc) throws IOException {
        Files.createDirectories(thuMuc);
        System.out.println("Da tao/kiem tra thu muc: " + thuMuc.toAbsolutePath());
    }

    public static void taoTep(Path tep) throws IOException {
        if (Files.notExists(tep)) {
            Files.createFile(tep);
            System.out.println("Da tao tep: " + tep.getFileName());
        }
    }

    public static void ghiTep(Path tep, String noiDung) throws IOException {
        Files.writeString(tep, noiDung, StandardCharsets.UTF_8);
        System.out.println("Da ghi noi dung vao: " + tep.getFileName());
    }

    public static String docTep(Path tep) throws IOException {
        return Files.readString(tep, StandardCharsets.UTF_8);
    }

    public static void lietKeThuMuc(Path thuMuc) throws IOException {
        System.out.println("Noi dung thu muc " + thuMuc.toAbsolutePath() + ":");
        try (Stream<Path> danhSach = Files.list(thuMuc)) {
            danhSach.forEach(path -> System.out.println(
                (Files.isDirectory(path) ? "[Thu muc] " : "[Tep] ") + path.getFileName()));
        }
    }

    public static void doiTenTep(Path tepCu, Path tepMoi) throws IOException {
        Files.move(tepCu, tepMoi, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Da doi ten thanh: " + tepMoi.getFileName());
    }

    public static boolean xoaTep(Path tep) throws IOException {
        if (Files.isRegularFile(tep)) {
            Files.delete(tep);
            System.out.println("Da xoa tep: " + tep.getFileName());
            return true;
        }
        System.out.println("Khong tim thay tep: " + tep);
        return false;
    }

    public static void main(String[] args) {
        Path thuMucGoc = Path.of("lab1-data");
        Path thuMucTaiLieu = thuMucGoc.resolve("tai-lieu");
        Path tepBanDau = thuMucTaiLieu.resolve("ghi-chu.txt");
        Path tepDaDoiTen = thuMucTaiLieu.resolve("noi-dung-lab1.txt");
        Path tepTam = thuMucGoc.resolve("tam.txt");

        try {
            taoThuMuc(thuMucTaiLieu);
            taoTep(tepBanDau);
            ghiTep(tepBanDau, "Day la noi dung thu nghiem cua Lab 1.");
            System.out.println("Noi dung da doc: " + docTep(tepBanDau));

            doiTenTep(tepBanDau, tepDaDoiTen);
            taoTep(tepTam);
            xoaTep(tepTam);
            lietKeThuMuc(thuMucGoc);
        } catch (IOException exception) {
            System.out.println("Co loi khi lam viec voi tep/thu muc: " + exception.getMessage());
        }
    }
}
