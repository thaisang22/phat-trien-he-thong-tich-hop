
public class SanPham {

    String maSanPham;
    String tenSanPham;
    double donGia;
    int soLuongTon;

    public SanPham(String maSanPham, String tenSanPham, double donGia, int soLuongTon) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        setDonGia(donGia);
        setSoLuongTon(soLuongTon);
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        } else {
            System.out.println("Đơn giá không được âm!");
            this.donGia = 0;
        }
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        if (soLuongTon >= 0) {
            this.soLuongTon = soLuongTon;
        } else {
            System.out.println("Số lượng tồn kho không được âm!");
            this.soLuongTon = 0;
        }
    }

    public double thanhTien() {
        return soLuongTon * donGia;
    }

    public void nhapHang(int soLuongNhap) {
        if (soLuongNhap > 0) {
            this.soLuongTon += soLuongNhap;
            System.out.println("Số lượng nhập đã vào là" + soLuongNhap);
        } else {
            System.out.println("Số lượng nhập không được dưới 0");
        }
    }

    public boolean banHang(int soLuongBan) {
        if (soLuongBan <= 0) {
            System.out.println("Số lượng bán phải lớn hơn 0");
            return false;
        }
        if (soLuongBan > this.soLuongTon) {
            System.out.println("Số lượng trong kho không đủ để bán");
            return false;
        }
        this.soLuongTon -= soLuongBan;
        System.out.println("Đã bán:" + soLuongBan + "Số lượng trong kho còn lại là:" + this.soLuongTon);
        return true;
    }

    public void hienThiThongTin() {
        System.out.println("---------------------------------------------");
        System.out.printf("Mã SP        : %s\n", maSanPham);
        System.out.printf("Tên SP       : %s\n", tenSanPham);
        System.out.printf("Đơn giá      : %,.2f VNĐ\n", donGia);
        System.out.printf("Số lượng tồn : %d\n", soLuongTon);
        System.out.printf("Thành tiền   : %,.2f VNĐ\n", thanhTien());
        System.out.println("---------------------------------------------");
    }

}
