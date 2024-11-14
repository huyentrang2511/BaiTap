package bai6;
import java.util.Scanner;
public class B6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//nhâp n
		System.out.println("nhap n=");
		int n=input.nextInt();
		//tính giai thừa
		long gt=1;
		for(int i=1;i<=n;i++) {
			gt*=i;
		}
		System.out.println("n!="+gt);
	}
}
