
public class NhanVien {

    protected String hoTen;
    protected String cccd;
    protected double luongCb;
    protected int ngayCong;

    public NhanVien(String hoTen, String cccd, double luongCb, int ngayCong) {
        this.hoTen = hoTen;
        this.cccd = cccd;
        this.luongCb = luongCb;
        this.ngayCong = ngayCong;
    }

    public double tinhLuong() {
        return luongCb * ngayCong;
    }

    public String getHoTen() { return hoTen; }
    public String getCccd() { return cccd; }
    public int getNgayCong() { return ngayCong; }
}

class NhanVienBanThoiGian extends NhanVien {
    private final double luongNgay;

    public NhanVienBanThoiGian(String hoTen,String cccd,double luongCb,int ngayCong) {
        super(hoTen, cccd, luongCb, ngayCong);
        this.luongNgay = luongCb;
    }


    @Override
    public double tinhLuong() {
        return luongNgay * ngayCong;
    }
}

class NhanVienToanThoiGian extends NhanVien {
        private final double luongThang;
       public NhanVienToanThoiGian(String hoTen,String cccd,double luongCb,int ngayCong) {
        super(hoTen, cccd, luongCb, ngayCong);
        this.luongThang = luongCb;

    }

    @Override
    public double tinhLuong() {
        return luongThang;
    }
}
