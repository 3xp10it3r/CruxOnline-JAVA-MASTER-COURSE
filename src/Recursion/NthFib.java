package Recursion;

public class NthFib {

	public static void main(String[] args) {
		int m = FibNth(5 + 1);
		System.out.println(m);
	}

	public static int FibNth(int n) {

		if (n == 0 || n == 1) {
			return n;
		}
		return FibNth(n - 1) + FibNth(n - 2);
	}
}
