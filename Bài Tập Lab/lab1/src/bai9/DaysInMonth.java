package bai9;
import java.util.Scanner;
public class DaysInMonth {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số từ 1 đến 12
        System.out.print("Nhập số tháng (1 - 12): ");
        int month = scanner.nextInt();

        // Lấy năm hiện tại
        int year = java.time.Year.now().getValue();
        int days;

        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                days = 31;
                System.out.println("Tháng " + month + " có " + days + " ngày.");
                break;

            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                System.out.println("Tháng " + month + " có " + days + " ngày.");
                break;

            case 2: // February
                // Kiểm tra năm nhuận
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    days = 29; // Năm nhuận
}
        }
	}}

        
