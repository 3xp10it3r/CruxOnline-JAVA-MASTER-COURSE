package Section9_TimeAndSpace;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 2, 34, 1, 34, 45, 56, 53, 2, 3, 34, 45, 2, 2, 535 };
		 quickSort(arr, 0, arr.length - 1);
		 for(int n : arr) {
			 System.out.print(n+" ");
		 }
	}

	public static void quickSort(int[] arr, int lo, int hi) {
		if(lo >= hi) {
			return;
		}
		
		// 1.partitioning
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];

		int left = lo;
		int right = hi;

		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}

			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}
		}
		// smaller problems
		quickSort(arr, lo, right);
		quickSort(arr, left, hi);

	}
}
