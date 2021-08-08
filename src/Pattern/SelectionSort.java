package Pattern;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 88, 99, 45, 23, 1, 2 };
		selectionSort(arr);
		for (int v : arr) {
			System.out.println(v);
		}
		

	}
	public static void selectionSort(int [] arr) {
		for(int counter = 0 ; counter < arr.length-1 ; counter++) {
			int min  = counter;
			for(int j  = counter + 1 ;  j <= arr.length -1 ; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp = arr[min];
			arr[min]=arr[counter];
			arr[counter] =temp;
		}
	}

}
