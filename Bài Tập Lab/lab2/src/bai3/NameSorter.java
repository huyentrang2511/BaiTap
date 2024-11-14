package bai3;
import java.util.Arrays;
import java.util.Scanner;
public class NameSorter {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Nhập số lượng tên sẽ được nhập
	        System.out.print("Nhập số lượng tên: ");
	        int numberOfNames = scanner.nextInt();
	        scanner.nextLine(); // Tiêu hóa ký tự xuống dòng

	        // Tạo một mảng để lưu trữ tên
	        String[] names = new String[numberOfNames];

	        // Nhập tên từ người dùng
	        for (int i = 0; i < numberOfNames; i++) {
	            System.out.print("Nhập tên " + (i + 1) + ": ");
	            names[i] = scanner.nextLine();
	        }

	        // Sắp xếp tên theo thứ tự tăng dần
	        Arrays.sort(names);

	        // In danh sách tên đã sắp xếp
	        System.out.println("\nDanh sách tên đã sắp xếp:");
	        for (String name : names) {
	            System.out.println(name);
	        }

	        // Đóng scanner
	        scanner.close();
	    }
}
