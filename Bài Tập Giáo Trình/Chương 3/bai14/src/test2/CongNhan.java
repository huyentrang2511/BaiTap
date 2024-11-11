package test2;
import java.util.Scanner;
public abstract class CongNhan {
String hoTen;
String diaChi;
String ngaySinh;
//phương thức nhập thông tin
public void nhapThongTin() {
	Scanner input = new Scanner(System.in);
	System.out.println("Họ tên: ");
    hoTen = input.nextLine();
    System.out.println("Địa chỉ");
    diaChi=input.nextLine();
    input.close();
}
//hàm tạo
public CongNhan(String hoTen, String diaChi, String ngaySinh) {
	this.hoTen=hoTen;
	this.diaChi=diaChi;
	this.ngaySinh=ngaySinh;
}
//phương thức tính lương
	public abstract double tinhLuong() ;
//phương thức in thông tin
	public void inThongTin() {
	System.out.println("Họ tên:" + hoTen);
	System.out.println("Địa chỉ:" + diaChi);
	System.out.println("Ngày sinh:"+ngaySinh);
	System.out.println("Lương tháng:"+tinhLuong());
	}

}
