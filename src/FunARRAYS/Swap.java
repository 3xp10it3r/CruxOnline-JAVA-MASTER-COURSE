package FunARRAYS;

public class Swap {
	public static void main(String[] args) {
		int arr[] = null;
		arr = new int[3];
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println("After Swapping");
		swap(arr,0,2);
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
