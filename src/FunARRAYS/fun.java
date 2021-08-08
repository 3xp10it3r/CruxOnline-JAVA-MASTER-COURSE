package FunARRAYS;

public class fun {
	// Global Variable
	public static int val = 20;

	public static void main(String[] args) {
		int [] arr = null;
		arr = new int[5];
		System.out.println(arr);
		arr[2]=30;
		for(int i = 0 ;i < arr.length;) {
			System.out.print(arr[i++] + " ");
		}
		System.out.println();
		
		int d = Addition(1010, 2);
		System.out.println(d);
		
		System.out.println(val);
		int val = 200;
		System.out.println(val);
		//global call
		System.out.println(fun.val);
	}

	public static int Addition(int n, int base) {
		return (n + base);
	}
}
