package FunARRAYS;

public class arr {
	public static void main(String[] args) {

		int []a = null;
		a=new int[6];
		a[0]=2;
		a[1]=1;
		a[2]=3;
		a[3]=4;
		a[4]=6;
		a[5]=5;
		int m = maxCandy(a, 6);
		System.out.println(m);
		
		for(int val : a) {
			System.out.println(val);
		}
	}

	static int maxCandy(int a[], int n) {
		int max = 0;
		// Your code goes here
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; ++j) {
				int h = Math.min(a[i], a[j]);
//				System.out.println(h);
				int area = j - i -1;
//				System.out.println(area);
				max = Math.max(max, h * area);
			}
		}
		return max;
	}
}
