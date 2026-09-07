
public class NhanVien {

    protected String hoTen;
    protected String cccd;
    protected double luongCb;

    public NhanVien(String hoTen, String cccd, double luongCb, int ngayCong) {
        this.hoTen = hoTen;
        this.cccd = cccd;
        this.luongCb = luongCb;
    }

    public double tinhLuong() {
        return 0;
    }
}

class NhanVienBanThoiGian extends NhanVien {
    private double luongNgay;

    public NhanVienBanThoiGian(String hoTen,String cccd,double luongCb,int ngayCong) {
        super(hoTen, cccd, luongCb, ngayCong);
    }


    @Override
    public double tinhLuong() {
        // TODO Auto-generated method stub
        return super.tinhLuong();
    }
    
    NhanVien nhanVien = new NhanVien("abc", "123", 10000, 20);
}

class NhanVienToanThoiGian extends NhanVien {
        private double luongThang;
       public NhanVienToanThoiGian(String hoTen,String cccd,double luongCb,int ngayCong) {
        super(hoTen, cccd, luongCb, ngayCong);

    }
}
