package Recursion;

public class Lastindex {
	public static void main(String[] args) {
		int[] arr = { 1, 22, 3, 4, 4, 4, 5,4, 7 };
		int m = LastIndex(arr, 0, 1);
		System.out.println(m);
	}

	public static int LastIndex(int[] arr, int i, int item) {
		if (i == arr.length)
			return -1;
		int index = LastIndex(arr, i + 1, item);

		if (index == -1) {
			if (arr[i] == item) {
				return i;
			} else
				return -1;
		}
		else {
			return index;
		}
//		return -1;
	}
}
