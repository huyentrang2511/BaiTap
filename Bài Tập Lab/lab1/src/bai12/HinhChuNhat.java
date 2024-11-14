package bai12;
import java.util.Scanner;
public class HinhChuNhat {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập một số nguyên N
        System.out.print("Nhập một số nguyên N: ");
        int N = scanner.nextInt();

        // In ra hình chữ nhật với kích thước N x N
        for (int i = 0; i < N; i++) {    // Vòng lặp điều khiển số hàng
            for (int j = 0; j < N; j++) { // Vòng lặp điều khiển số dấu "*"
                System.out.print("*");
            }
            System.out.println(); // Xuống dòng sau khi in hết mỗi hàng
        }

        scanner.close();
    }
}
