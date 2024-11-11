package test1;
import java.util.Scanner;
abstract class NguoiLaoDong {
	//thuộc tính họ tên và địa chỉ
	String hoTen;
	String diaChi;
	//phương thức nhập thông tin
	public void nhapThongTin() {
		Scanner input = new Scanner(System.in);
		System.out.println("Họ tên: ");
        hoTen = input.nextLine();
        System.out.println("Địa chỉ: ");
        diaChi = input.nextLine();
        input.close();
    }
	//hàm tạo
	public NguoiLaoDong(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    // Phương thức trừu tượng để tính lương
    public abstract double tinhLuong();
    // Phương thức in thông tin 
    public void inThongTin() {
    	System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Lương tháng: " + tinhLuong());
    }

}
