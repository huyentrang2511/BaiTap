package test1;

public class KiSu extends NguoiLaoDong {
	private double luongCoBan;
    private double heSoLuong;
    private int soNgayCong;
 // Constructor
    public KiSu(String hoTen, String diaChi, double luongCoBan, double heSoLuong, int soNgayCong) {
        super(hoTen, diaChi);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.soNgayCong = soNgayCong;
    }
 // Cài đặt phương thức tính lương
    @Override
    public double tinhLuong() {
        double thuong;
        if (soNgayCong >= 25) {
            thuong = 2000000;
        } else if (soNgayCong > 15) {
            thuong = 1000000;
        } else {
            thuong = 500000;
        }
        return luongCoBan * heSoLuong + thuong;
    }
}
