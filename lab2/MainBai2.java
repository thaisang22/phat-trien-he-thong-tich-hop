
public class MainBai2 {

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Nguyễn Văn An", 2004, "123 Nguyễn Văn Bảo, Gò Vấp, TP.HCM", "SV001", "Công nghệ thông tin", 8.8);
        SinhVien sv2 = new SinhVien("Trần Thị Bình", 2005, "456 Lê Đức Thọ, Gò Vấp, TP.HCM", "SV002", "Hệ thống thông tin", 6.8);
        GiangVien gv1 = new GiangVien("TS. Phạm Văn Cường", 1982, "789 Quang Trung, Gò Vấp, TP.HCM", "GV001", "Kỹ thuật phần mềm", 5000000.0, 4.5);
        GiangVien gv2 = new GiangVien("ThS. Lê Thi Duyên", 1990, "101 Phan Văn Trị, Gò Vấp, TP.HCM", "GV002", "Khoa học dữ liệu", 5000000.0, 3.8);
        System.out.println("\n=== DANH SÁCH SINH VIÊN ===");
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();

        System.out.println("\n=== DANH SÁCH GIẢNG VIÊN ===");
        gv1.hienThiThongTin();
        gv2.hienThiThongTin();

        System.out.println("\n=== TỔNG HỢP XẾP LOẠI SINH VIÊN ===");
        System.out.printf("- Sinh viên %s (%s): Xếp loại %s (ĐTB: %.2f)\n",
                sv1.getHoTen(), sv1.getMaSinhVien(), sv1.xepLoai(), sv1.getDiemTrungBinh());
        System.out.printf("- Sinh viên %s (%s): Xếp loại %s (ĐTB: %.2f)\n",
                sv2.getHoTen(), sv2.getMaSinhVien(), sv2.xepLoai(), sv2.getDiemTrungBinh());

        System.out.println("\n=== TỔNG HỢP LƯƠNG GIẢNG VIÊN ===");
        System.out.printf("- Giảng viên %s (%s): Lương = %,.2f VNĐ\n",
                gv1.getHoTen(), gv1.getMaGiangVien(), gv1.tinhLuong());
        System.out.printf("- Giảng viên %s (%s): Lương = %,.2f VNĐ\n",
                gv2.getHoTen(), gv2.getMaGiangVien(), gv2.tinhLuong());
    }
}
