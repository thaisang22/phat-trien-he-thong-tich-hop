public class SinhVien extends Nguoi {
    private String maSinhVien;
    private String nganhHoc;
    private double diemTrungBinh;

    public SinhVien(String hoTen, int namSinh, String diaChi, String maSinhVien, String nganhHoc, double diemTrungBinh) {
        super(hoTen, namSinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.nganhHoc = nganhHoc;
        setDiemTrungBinh(diemTrungBinh);
    }

    // Getter và Setter
    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        if (diemTrungBinh >= 0.0 && diemTrungBinh <= 10.0) {
            this.diemTrungBinh = diemTrungBinh;
        } else {
            System.out.println("Điểm trung bình phải từ 0.0 đến 10.0!");
            this.diemTrungBinh = 0.0;
        }
    }


    public String xepLoai() {
        if (diemTrungBinh >= 8.5) {
            return "Giỏi";
        } else if (diemTrungBinh >= 7.0) {
            return "Khá";
        } else if (diemTrungBinh >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
    @Override
    public void hienThiThongTin() {
        System.out.println("---------------------------------------------");
        System.out.println("--THÔNG TIN SINH VIÊN--");
        System.out.println("Mã SV    : " + maSinhVien);
        super.hienThiThongTin();
        System.out.println("Ngành học: " + nganhHoc);
        System.out.printf("Điểm TB  : %.2f\n", diemTrungBinh);
        System.out.println("Xếp loại : " + xepLoai());
        System.out.println("---------------------------------------------");
    }
}
