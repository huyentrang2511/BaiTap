package bai3;
import java.util.Scanner;
public class B3 {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 double a, b;
		// Nhập giá trị của a và b
	        System.out.print("Nhập hệ số a: ");
	        a = scanner.nextDouble();

	        System.out.print("Nhập hệ số b: ");
	        b = scanner.nextDouble();
	     // Kiểm tra trường hợp đặc biệt khi a = 0
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình có vô số nghiệm.");
	            } else {
	                System.out.println("Phương trình vô nghiệm.");
	            }
	        } else {
	            // Tính nghiệm x
	            double x = -b / a;
	            System.out.println("Nghiệm của phương trình là: x = " + x);
	        }
}}
