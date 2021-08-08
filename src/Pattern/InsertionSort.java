package Pattern;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 88, 99, 45, 23, 1, 2 };
		insertionSort(arr);
		for (int v : arr) {
			System.out.println(v);
		}

	}

	public static void insertionSort(int[] arr) {
		for (int counter = 0; counter <= arr.length - 1; counter++) {
			int val = arr[counter];
			int j = counter - 1;
			while (j >= 0 && val < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}
	}

}
