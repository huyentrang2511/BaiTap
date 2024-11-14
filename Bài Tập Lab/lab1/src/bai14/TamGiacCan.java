package bai14;
import java.util.Scanner;
public class TamGiacCan {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập một số nguyên N
        System.out.print("Nhập một số nguyên N: ");
        int N = scanner.nextInt();

        // In ra tam giác với N dòng
        for (int i = 1; i <= N; i++) { // Vòng lặp điều khiển số dòng
            // In khoảng trắng trước dấu "*"
            for (int j = N; j > i; j--) { // Vòng lặp để in khoảng trắng trước
                System.out.print(" ");
            }
            // In dấu "*" với khoảng trắng sau
            for (int j = 1; j <= i; j++) { // Vòng lặp để in dấu "*"
                System.out.print("* ");
            }
            System.out.println(); // Xuống dòng sau khi in hết mỗi hàng
        }

        scanner.close();
    }
}
