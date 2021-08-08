package Pattern;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 88, 99, 45, 23, 1, 2 };
		bubbleSort(arr);
		for (int v : arr) {
			System.out.println(v);
		}
		
	}

	public static void bubbleSort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - 1 - counter; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
	}

}
