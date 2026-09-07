public class SanPham {

    String ma;
    String ten;
    float donGia;
    int soLuong;

    public SanPham(String ma, String ten, float donGia, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    void thanhTien() {
        float thanhTien;
        thanhTien = donGia * soLuong;

        System.out.println("Thanh tien = " + thanhTien);
    }

    void infor() {
        System.out.println("Ma: " + ma);
        System.out.println("Ten: " + ten);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
    }

    public static void main(String[] args) {

        SanPham sp = new SanPham("01", "But bi", 5000, 10);
        sp.infor();
        sp.thanhTien();
    }
}