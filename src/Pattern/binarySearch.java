package Pattern;

public class binarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 53, 222, 464, 4535, 9389 };
		int x =BinarySearch(arr, 53);
		System.out.println(x);
	}

	public static int BinarySearch(int[] arr, int item) {

		int low = 0;
		int high = arr.length - 1;
		
		while(low<=high) {
			int mid  = (low + high)/2;
			if(item < arr[mid]) {
				high=mid-1;
			}else if(item>arr[mid]) {
				low = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
