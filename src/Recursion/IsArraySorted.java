package Recursion;

public class IsArraySorted {
	public static void main(String[] args) {
		int[] arr = { 1,22, 3, 4, 7 };
		boolean bal = IsSorted(arr, 0);
		System.out.println(bal);
	}

	public static boolean IsSorted(int[] arr, int i) {
		if (arr.length-1 == i)
			return true;
		if (arr[i] > arr[i + 1])
			return false;
		else {
			return IsSorted(arr, i + 1);
		}

	}
}
