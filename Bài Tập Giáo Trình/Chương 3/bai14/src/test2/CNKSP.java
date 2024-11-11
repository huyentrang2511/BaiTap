package test2;
import java.util.Scanner;
public class CNKSP extends CongNhan {
//bổ sung thêm các thuộc tính cần thiết
	double soSanPham;
	double donGiaSanPham;
// khởi tạo gtri ban đầu 
	public CNKSP(String hoTen, String diaChi, String ngaySinh, double soSanPham, double donGiaSanPham) {
		super(hoTen, diaChi, ngaySinh);
		this.soSanPham= soSanPham;
		this.donGiaSanPham=donGiaSanPham;
	}
//phương thức tính lương
	@Override
	public double tinhLuong() {
		double thuong;
		double spMucQuyDinh = 1000;
		if(soSanPham-spMucQuyDinh>=150) {
			thuong=1500000;
		}else if(soSanPham-spMucQuyDinh>=100) {
			thuong=1000000;
		}else {
			thuong=0;
		}
		return soSanPham*donGiaSanPham+thuong;
	}
	public void nhapThongTin() {
        super.nhapThongTin(); // Gọi phương thức nhập thông tin từ lớp cha
        Scanner input = new Scanner(System.in);
        System.out.print("Số sản phẩm: ");
        soSanPham = input.nextDouble(); // Nhập số sản phẩm
        System.out.print("Đơn giá sản phẩm: ");
        donGiaSanPham = input.nextDouble(); // Nhập đơn giá sản phẩm
        input.close();
    }
}
