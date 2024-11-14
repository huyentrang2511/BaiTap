package bai7;

public class B7 {
	public static void main(String[] args) {
	int n = 20; // số lượng số fibonacci cần in
    int so1 = 0, so2 = 1;

    System.out.print("20 số fibonacci đầu tiên:");
    for (int i = 1; i <= n; ++i) {
        System.out.print(so1 + " ");

        // Compute the next number
        int nextNum = so1 + so2;
        so1 = so2;
        so2 = nextNum;
}
    }
}
