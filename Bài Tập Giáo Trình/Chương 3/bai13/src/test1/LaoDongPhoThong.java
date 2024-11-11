package test1;

class LaoDongPhoThong extends NguoiLaoDong {
    private int soNgayCong;
    private double donGiaNgayCong;
    public LaoDongPhoThong(String hoTen,  String diaChi, int soNgayCong, double donGiaNgayCong) {
    	super(hoTen, diaChi);
        this.soNgayCong = soNgayCong;
        this.donGiaNgayCong = donGiaNgayCong;
    }
    @Override
    public double tinhLuong() {
        double thuong;
        if (soNgayCong >= 25) {
            thuong = 1000000;
        } else if (soNgayCong > 15) {
            thuong = 700000;
        } else {
            thuong = 0;
        }
        return soNgayCong * donGiaNgayCong + thuong;
    }
}
