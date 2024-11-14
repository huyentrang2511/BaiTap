package bai8;
import java.util.ArrayList;
import java.util.Scanner;
public class B8 {
	 // Các thuộc tính của sinh viên
    String studentCode;
    String studentName;
    int studentAge;
    String studentSex;

    // Hàm khởi tạo để gán giá trị cho thông tin sinh viên
    public 	B8(String code, String name, int age, String sex) {
        this.studentCode = code;
        this.studentName = name;
        this.studentAge = age;
        this.studentSex = sex;
    }

    // Phương thức để hiển thị thông tin sinh viên
    public void displayStudentInfo() {
        System.out.println("Mã sinh viên: " + studentCode);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Tuổi sinh viên: " + studentAge);
        System.out.println("Giới tính sinh viên: " + studentSex);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<B8> studentList = new ArrayList<>();
        String choice;

        do {
            // Yêu cầu người dùng nhập thông tin sinh viên
            System.out.print("Nhập mã sinh viên: ");
            String code = scanner.nextLine();

            System.out.print("Nhập tên sinh viên: ");
            String name = scanner.nextLine();

            System.out.print("Nhập tuổi sinh viên: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập giới tính sinh viên: ");
            String sex = scanner.nextLine();

            // Tạo đối tượng StudentManagement mới và thêm vào danh sách
            B8 student = new B8(code, name, age, sex);
            studentList.add(student);

            // Hỏi người dùng có muốn tiếp tục không
            System.out.print("Nhấn phím bất kỳ để tiếp tục hoặc 'n' để dừng: ");
            choice = scanner.nextLine();

        } while (!choice.equalsIgnoreCase("n"));

        // Hiển thị thông tin của tất cả sinh viên
        System.out.println("\nDanh sách sinh viên:");
        for (B8 student : studentList) {
            student.displayStudentInfo();
        }

        scanner.close();
    }
}