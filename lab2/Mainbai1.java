

public class Mainbai1 {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("      BÀI 1: QUẢN LÝ SẢN PHẨM            ");
        System.out.println("=========================================");

        SanPham sp1 = new SanPham("SP001", "Laptop Dell XPS 15", 35000000.0, 10);
        SanPham sp2 = new SanPham("SP002", "Chuột Logitech MX Master 3S", 2500000.0, 5);

        System.out.println("\n[THÔNG TIN BAN ĐẦU CÁC SẢN PHẨM]");
        sp1.hienThiThongTin();
        sp2.hienThiThongTin();
        System.out.println("\n--- THAO TÁC 1: NHẬP HÀNG CHO SP1 (Thêm 5 cái) ---");
        sp1.nhapHang(5);
        System.out.println("Thông tin SP1 sau khi nhập hàng:");
        sp1.hienThiThongTin();

        System.out.println("\n--- THAO TÁC 2: BÁN HÀNG THÀNH CÔNG (SP1 bán 3 cái) ---");
        boolean ketQuaBan1 = sp1.banHang(3);
        System.out.println("Kết quả bán hàng: " + (ketQuaBan1 ? "Thành công" : "Thất bại"));
        System.out.println("Thông tin SP1 sau khi bán hàng:");
        sp1.hienThiThongTin();
        System.out.println("\n--- THAO TÁC 3: BÁN HÀNG VƯỢT TỒN KHO (SP2 tồn 5, bán 10) ---");
        boolean ketQuaBan2 = sp2.banHang(10);
        System.out.println("Kết quả bán hàng: " + (ketQuaBan2 ? "Thành công" : "Thất bại"));
        System.out.println("Thông tin SP2 sau khi thử bán hàng không thành công:");
        sp2.hienThiThongTin();
    }
}
