package bai1;
import java.util.Arrays;
import java.util.Scanner;
public class Array {
	// Khai báo mảng số nguyên với 10 phần tử
    private static int[] array = new int[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập dữ liệu cho mảng
        System.out.println("Nhập 10 số nguyên cho mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int choice;
        do {
            // Hiển thị menu
            System.out.println("\nChọn chức năng:");
            System.out.println("1. In mảng");
            System.out.println("2. Tìm một phần tử");
            System.out.println("3. Tìm giá trị lớn nhất");
            System.out.println("4. Tính tổng các phần tử");
            System.out.println("5. Sắp xếp mảng theo thứ tự giảm dần");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn của bạn (1-6): ");
            choice = scanner.nextInt();

            // Gọi các hàm tương ứng với lựa chọn của người dùng
            switch (choice) {
                case 1:
                    printArray();
                    break;
                case 2:
                    searchElement(scanner);
                    break;
                case 3:
                    findMaximum();
                    break;
                case 4:
                    calculateSum();
                    break;
                case 5:
                    sortArrayDescending();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        } while (choice != 6);

        scanner.close();
    }

    // 2. Hàm để in tất cả các phần tử của mảng
    private static void printArray() {
        System.out.println("Các phần tử trong mảng:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 3. Hàm để tìm kiếm một giá trị trong mảng
    private static void searchElement(Scanner scanner) {
        System.out.print("Nhập giá trị bạn muốn tìm: ");
        int value = scanner.nextInt();
        boolean found = false;
        for (int num : array) {
            if (num == value) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Giá trị " + value + " tồn tại trong mảng.");
        } else {
            System.out.println("Giá trị " + value + " không tồn tại trong mảng.");
        }
    }

    // 4. Hàm để tìm giá trị lớn nhất trong mảng
    private static void findMaximum() {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }

    // 5. Hàm để tính tổng các phần tử của mảng
    private static void calculateSum() {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }

    // 6. Hàm để sắp xếp mảng theo thứ tự giảm dần
    private static void sortArrayDescending() {
        Arrays.sort(array); // Sắp xếp mảng theo thứ tự tăng dần
        for (int i = 0; i < array.length / 2; i++) {
            // Hoán đổi các phần tử để tạo ra mảng giảm dần
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Mảng đã được sắp xếp theo thứ tự giảm dần.");
    }
}
