package test1;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        // Khởi tạo và nhập thông tin cho LaoDongPhoThong
        System.out.println("Nhập thông tin Lao động phổ thông:");
        System.out.print("Họ tên: ");
        String hoTenLDPT = input.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChiLDPT = input.nextLine();
        System.out.print("Số ngày công: ");
        int soNgayCongLDPT = input.nextInt();
        System.out.print("Đơn giá ngày công: ");
        double donGiaNgayCong = input.nextDouble();
        
        LaoDongPhoThong ldpt = new LaoDongPhoThong(hoTenLDPT, diaChiLDPT, soNgayCongLDPT, donGiaNgayCong);
        ldpt.inThongTin();
     // Khởi tạo và nhập thông tin cho Kisu
        input.nextLine(); // Bỏ qua dòng thừa
        System.out.println("\nNhập thông tin Kỹ sư:");
        System.out.print("Họ tên: ");
        String hoTenKS = input.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChiKS = input.nextLine();
        System.out.print("Lương cơ bản: ");
        double luongCoBan = input.nextDouble();
        System.out.print("Hệ số lương: ");
        double heSoLuong = input.nextDouble();
        System.out.print("Số ngày công: ");
        int soNgayCongKS = input.nextInt();
        
        KiSu ks = new KiSu(hoTenKS, diaChiKS, luongCoBan, heSoLuong, soNgayCongKS);
        ks.inThongTin();
        input.close(); 
}
}
