package bai2;
import java.util.Scanner;
import java.util.Arrays;
public class Array2 {
	private static int[][] array;
    private static int n, m;

    // Hàm cho phép người dùng nhập giá trị cho các phần tử của mảng
    public static void nhapGiaTri() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
    }

    // Hàm in tất cả các phần tử của mảng
    public static void inMang() {
        System.out.println("Các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Hàm tính tổng các phần tử của mảng
    public static int tinhTong() {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tong += array[i][j];
            }
        }
        return tong;
    }

    // Hàm kiểm tra xem một số có tồn tại trong mảng hay không
    public static boolean kiemTraTonTai(int x) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    // Hàm sắp xếp các phần tử của mảng theo thứ tự tăng dần
    public static void sapXep() {
        int[] tempArray = new int[n * m];
        int index = 0;

        // Chuyển các phần tử từ mảng 2 chiều sang mảng 1 chiều để sắp xếp
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tempArray[index++] = array[i][j];
            }
        }

        // Sắp xếp mảng 1 chiều
        Arrays.sort(tempArray);

        // Chuyển các phần tử đã sắp xếp trở lại mảng 2 chiều
        index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = tempArray[index++];
            }
        }

        // In mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        inMang();
    }

    // Menu cho chương trình
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Nhập giá trị cho mảng");
            System.out.println("2. In mảng");
            System.out.println("3. Tính tổng các phần tử của mảng");
            System.out.println("4. Kiểm tra số có tồn tại trong mảng");
            System.out.println("5. Sắp xếp mảng theo thứ tự tăng dần");
            System.out.println("6. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    nhapGiaTri();
                    break;
                case 2:
                    inMang();
                    break;
                case 3:
                    System.out.println("Tổng của các phần tử trong mảng: " + tinhTong());
                    break;
                case 4:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int x = scanner.nextInt();
                    if (kiemTraTonTai(x)) {
                        System.out.println("Số " + x + " tồn tại trong mảng.");
                    } else {
                        System.out.println("Số " + x + " không tồn tại trong mảng.");
                    }
                    break;
                case 5:
                    sapXep();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của mảng
        System.out.print("Nhập số dòng n: ");
        n = scanner.nextInt();
        System.out.print("Nhập số cột m: ");
        m = scanner.nextInt();

        // Khởi tạo mảng 2 chiều
        array = new int[n][m];

        // Hiển thị menu
        menu();
    }
}
