public class GiangVien extends Nguoi {
    private String maGiangVien;
    private String chuyenMon;
    private double luongCoBan;
    private double heSoLuong;

    public GiangVien(String hoTen, int namSinh, String diaChi, String maGiangVien, String chuyenMon, double luongCoBan, double heSoLuong) {
        super(hoTen, namSinh, diaChi);
        this.maGiangVien = maGiangVien;
        this.chuyenMon = chuyenMon;
        setLuongCoBan(luongCoBan);
        setHeSoLuong(heSoLuong);
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        if (luongCoBan >= 0) {
            this.luongCoBan = luongCoBan;
        } else {
            System.out.println("Lương cơ bản không được âm!");
            this.luongCoBan = 0;
        }
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        if (heSoLuong >= 0) {
            this.heSoLuong = heSoLuong;
        } else {
            System.out.println("Hệ số lương không được âm!");
            this.heSoLuong = 1.0;
        }
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public void hienThiThongTin() {
        System.out.println("---------------------------------------------");
        System.out.println("[THÔNG TIN GIẢNG VIÊN]");
        System.out.println("Mã GV      : " + maGiangVien);
        super.hienThiThongTin();
        System.out.println("Chuyên môn : " + chuyenMon);
        System.out.printf("Lương cơ bản: %,.2f VNĐ\n", luongCoBan);
        System.out.printf("Hệ số lương : %.2f\n", heSoLuong);
        System.out.printf("Lương thực nhận: %,.2f VNĐ\n", tinhLuong());
        System.out.println("---------------------------------------------");
    }
}
