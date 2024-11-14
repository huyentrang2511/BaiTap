package bai11;
import java.util.Scanner;
public class BangCuuChuong {
public static void main( String[] args) {
	Scanner scanner = new Scanner(System.in);
	//nhập số nguyên muốn in ra bảng cửu chương
	System.out.print("Nhập số nguyên muốn in ra bảng cửu chương" );
	int num=scanner.nextInt();
	//In bảng cửu chương
	System.out.println("Bảng cửu chương của " + num + ":");
    for (int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));
    }

    scanner.close();
}
}
