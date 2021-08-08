package Strings;

public class StringBuliderPerformance {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		stringAppend(100000);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		long s = System.currentTimeMillis();
		StringBuilderAppend(100000);
		long e = System.currentTimeMillis();
		System.out.println(e - s);
	}

	public static void stringAppend(int n) {
		String s = "";
		for (int i = 1; i <= n; i++) {
			s += i;
		}
	}

	public static void StringBuilderAppend(int n) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			s.append(i);
		}
	}

}
