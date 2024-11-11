package test2;

public class CNTCN extends CongNhan {
int soNgayCong;
double luongCoBan;
double heSoLuong;
//hàm tạo
public CNTCN(String hoTen, String diaChi, String ngaySinh, int soNgayCong, double luongCoBan, double heSoLuong) {
	super(hoTen, diaChi, ngaySinh);
	this.luongCoBan=luongCoBan;
	this.heSoLuong=heSoLuong;
	this.soNgayCong=soNgayCong;
}
//tính lương
@Override
public double tinhLuong() {
	double thuong;
	if(soNgayCong>=20) {
		thuong=1.2*luongCoBan;
	}else {
		thuong=0;
	}
	return luongCoBan*heSoLuong +thuong;
}
}
