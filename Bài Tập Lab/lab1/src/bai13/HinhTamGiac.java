package bai13;
import java.util.Scanner;
public class HinhTamGiac {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

        // Yêu cầu người dùng nhập một số nguyên N
        System.out.print("Nhập một số nguyên N: ");
        int N = scanner.nextInt();
        //in ra hình tam giác
        for (int i = 1; i <= N; i++) {    // Vòng lặp điều khiển số dòng
            for (int j = 1; j <= i; j++) { // Vòng lặp điều khiển số lượng dấu "*"
                System.out.print("*");
            }
            System.out.println(); // Xuống dòng sau khi in hết mỗi hàng
        }

        scanner.close();
        	
        }
	}

