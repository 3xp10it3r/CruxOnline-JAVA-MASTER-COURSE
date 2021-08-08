package ArrayListAnd2Darray;

public class TwoDArray {

	public static void main(String[] args) {
		int [][] arr = new int[3][];
		
		arr[0] = new int[5];
		arr[2] = new int[3];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[0][1]);
		System.out.println(arr[2][2]);
		System.out.println();
//		System.out.println(arr[1][2]);  null pointer exception...
		for(int val  :arr[0]) {
			System.out.println(val);
		}
		for(int val  :arr[1]) {
			System.out.println(val);
		}
		for(int val  :arr[2]) {
			System.out.println(val);
		}
	}
}
