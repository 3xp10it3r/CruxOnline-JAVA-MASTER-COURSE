package Pattern;

public class lowerAndUpperBound {

	public static void main(String[] args) {
		int[] arr = {  53, 53, 53, 53, 53,53, 4535, 9389 };
		int x = lowerBound(arr, 53);
		int y = upperBound(arr,53);
		System.out.println(x+" " +y);

	}

	public static int lowerBound(int[] arr, int item) {
		int low = 0, high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == item) {
				ans = mid;
				high = mid - 1;
			} else if (arr[mid] < item) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	};

	public static int upperBound(int [] arr , int item) {
		int low = 0 , high = arr.length -1;
		int ans = -1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==item) {
				ans = mid;
				low = mid+1;
			}
			else if(arr[mid]>item) {
				high = mid - 1;
			}else {
				low = mid+1;
			}
		}
		return ans;
	}
}
