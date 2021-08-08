package Section9_TimeAndSpace;

public class Sort0s1s2s {

	public static void main(String[] args) {

		int[] arr = {2,1,0,0,1,0,0,1,2};
		sort0s1s2s(arr, 0, arr.length-1);
		for(int n : arr) {
			System.out.print(n+" ");
		}
	}

	public static void sort0s1s2s(int[] arr, int low, int high) {
		int mid = 0;
		while (mid <= high) {
			if (arr[mid] == 0) {
				swap(arr, low, mid);
				mid++;
				low++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				swap(arr, mid, high);
				high--;
			}
		}
	}

	private static void swap(int[] arr, int one, int two) {
		int temp = arr[one];
		arr[one] = arr[two];
		arr[two] = temp;
	}
}
