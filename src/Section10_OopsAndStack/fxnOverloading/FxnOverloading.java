package Section10_OopsAndStack.fxnOverloading;

public class FxnOverloading {

	public static void main(String[] args) {

		System.out.println(sum(1, 2));
		System.out.println(sum(1.1, 2.2));
		System.out.println(sum("abc", 2, 2, 2, 3, 2, 2, 4, 2, 2));

		int[] arr = { 2, 2, 2, 3, 2, 2, 4, 2, 2 };
		System.out.println(sum("abc",arr));
	}

	public static int sum(int a, int b) {
		return a + b;
	}

//	public static void sum(int a ,int b) {
//		System.out.println(a+b);
//	}
	public static double sum(double a, double b) {
		return a + b;
	}

	public static int sum(String a, int... args) { // always variable args at last , only one args can be used...
		int sum = 0;
		for (int val : args) {
			sum += val;
		}
		return sum;
	}

}
