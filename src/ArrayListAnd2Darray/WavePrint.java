package ArrayListAnd2Darray;

public class WavePrint {
	public static void main(String[] args) {
		int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		wavePrint(arr);

	}

	public static void wavePrint(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				for(int j = 0 ; j < arr[i].length ; j++)
					System.out.println(arr[i][j]+ " ");
			}
			else {
				for(int j = arr[i].length-1 ; j>=0;j--) {
					System.out.println(arr[i][j]+" ");
				}
			}
		}

	}
}
