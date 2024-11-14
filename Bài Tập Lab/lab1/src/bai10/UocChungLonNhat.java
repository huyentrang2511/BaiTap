package bai10;
import java.util.Scanner;
public class UocChungLonNhat {
	//hàm tính ước chung lớn nhất
	 public static int UocChungLonNhat(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập hai số nguyên từ bàn phím
	        System.out.print("Nhập số nguyên a: ");
	        int a = scanner.nextInt();

	        System.out.print("Nhập số nguyên b: ");
	        int b = scanner.nextInt();

	        // Tính và hiển thị GCD
	        int UCLN = UocChungLonNhat(a, b);
	        System.out.println("Ước số chung lớn nhất của " + a + " và " + b + " là: " + UCLN);

	        scanner.close();
	    }
}
