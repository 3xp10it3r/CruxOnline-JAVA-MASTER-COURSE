package Recursion;

public class FirstIndex {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 4, 4, 4, 4, 7 };
		int m = Firstindex(arr, 0, 4);
		System.out.println(m);
	}

	public static int Firstindex(int[] arr, int i, int item) {
		if (i > arr.length - 1)
			return -1;
		if (arr[i] == item)
			return i;
		else
			return Firstindex(arr, i + 1, item);
	}
}
