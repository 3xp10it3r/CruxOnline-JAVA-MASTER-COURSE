package cruxOnline;

import java.util.Scanner;

public class FibN {

	public static void main(String[] args) {
		int a=0;
		int b=1,c=3;
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(a+" "+b+" ");
		while(c<=n) {
			
			int sum = a + b;
			a=b;
			b=sum;
			System.out.print(" "+b+" ");
			c+=1;
		}
	}

}
