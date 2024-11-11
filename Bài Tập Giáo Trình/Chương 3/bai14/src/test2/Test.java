package test2;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    
    // Khởi tạo và nhập thông tin cho CNKSP
    System.out.println("Nhập thông tinCNKSP:");
    System.out.print("Họ tên: ");
    String hoTenCNKSP = input.nextLine();
    System.out.print("Địa chỉ: ");
    String diaChiCNKSP = input.nextLine();
    System.out.print("Ngày sinh: ");
    String ngaySinhCNKSP = input.nextLine();
    System.out.print("Số sản phẩm: ");
    int soSanPham = input.nextInt();
    System.out.print("Đơn giá sp: ");
    double donGiaSanPham = input.nextDouble();
    
    CNKSP cnksp = new CNKSP(hoTenCNKSP, diaChiCNKSP,ngaySinhCNKSP, soSanPham, donGiaSanPham);
    cnksp.inThongTin();
 // Khởi tạo và nhập thông tin cho CNTCN
    input.nextLine(); // Bỏ qua dòng thừa
    System.out.println("\nNhập thông tin CNTCN:");
    System.out.print("Họ tên: ");
    String hoTenCNTCN = input.nextLine();
    System.out.print("Địa chỉ: ");
    String diaChiCNTCN = input.nextLine();
    System.out.print("Ngày sinh: ");
    String ngaySinhCNTCN = input.nextLine();
    System.out.print("Lương cơ bản: ");
    double luongCoBan = input.nextDouble();
    System.out.print("Hệ số lương: ");
    double heSoLuong = input.nextDouble();
    System.out.print("Số ngày công: ");
    int soNgayCongCNTCN = input.nextInt();
    
    CNTCN cntcn = new CNTCN(hoTenCNTCN, diaChiCNTCN,ngaySinhCNTCN, soNgayCongCNTCN, luongCoBan, heSoLuong);
    cntcn.inThongTin();
    input.close(); 
}
}
