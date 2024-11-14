package bai2;
import java.util.Scanner;
public class B2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double toan, ly, hoa;
		System.out.print("Nhập điểm Toán: ");
        toan = scanner.nextDouble();

        System.out.print("Nhập điểm Lý: ");
        ly = scanner.nextDouble();

        System.out.print("Nhập điểm Hóa: ");
        hoa = scanner.nextDouble();
        //tính điểm tbinh
        double trungBinh = (toan + ly + hoa) / 3;
        //xếp hạng
        String xepHang;
        if (trungBinh >= 8.0) {
            xepHang = "A";
        } else if (trungBinh >= 6.5) {
            xepHang = "B";
        } else if (trungBinh >= 5.0) {
            xepHang = "C";
        } else {
            xepHang = "D";
        }
     // Xuất kết quả điểm trung bình và xếp hạng
        System.out.println("Điểm trung bình: " + trungBinh);
        System.out.println("Xếp hạng: " + xepHang);
        
	}
}
