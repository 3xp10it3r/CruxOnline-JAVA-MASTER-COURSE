package Recursion;

public class PDIskip {

	public static void main(String[] args) {
		PDI(5);
		System.out.println("******************");
		PI(5);
		System.out.println("**************");
		PID(5);
		System.out.println("**************");
		PDISkip(5);
	}

	public static void PDISkip(int n) {
		if (n == 0)
			return;
		if (n % 2 != 0) {
			System.out.println(n);
			PDISkip(n - 1);
		} else {
			PDISkip(n - 1);
		}
		if(n%2==0)
			System.out.println(n);
//		System.out.println(n);
//		PDISkip(n - 1);
//		System.out.println(n);
	}

	public static void PDI(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		PDI(n - 1);
//		System.out.println(n);
	}

	public static void PI(int n) {
		if (n == 0)
			return;
//		System.out.println(n);
		PI(n - 1);
		System.out.println(n);
	}

	public static void PID(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		PID(n - 1);
		System.out.println(n);
	}
}
