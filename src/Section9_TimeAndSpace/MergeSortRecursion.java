package Section9_TimeAndSpace;

public class MergeSortRecursion {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 5, 8, 12, 22, 32, 40, 45, 55 };
		int[] ans = mergeTwoSortedArray(arr1, arr2);
		for (int val : ans) {
			System.out.print(val + " ");
		}
		System.out.println();
		int[] arr = { 1, 0, 23, 34, 31, 45, 34, 23, 45, 3, 2 };
		int[] ans1 = mergeSort(arr, 0, arr.length - 1);
		for (int val : ans1) {
			System.out.print(val + " ");
		}
	}

	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
		int i = 0, j = 0, k = 0;
		int[] merged = new int[arr1.length + arr2.length];

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				merged[k] = arr1[i];
				i++;
				k++;
			} else {
				merged[k] = arr2[j];
				j++;
				k++;
			}
		}
		if (i == arr1.length) {
			while (j < arr2.length) {
				merged[k] = arr2[j];
				j++;
				k++;
			}
		}
		if (j == arr2.length) {
			while (i < arr1.length) {
				merged[k] = arr1[i];
				i++;
				k++;
			}
		}
		return merged;
	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int mid = (lo + hi) / 2;

		int[] arr1 = mergeSort(arr, lo, mid);
		int[] arr2 = mergeSort(arr, mid + 1, hi);

		int[] ans = mergeTwoSortedArray(arr1, arr2);

		return ans;

	}
}
