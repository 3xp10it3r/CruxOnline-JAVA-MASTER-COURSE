package Pattern;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		
		int row = 1;
		int nsp=0;
		int nst=n;
		while(row<=n) {
			int t=1;
			while(t<=nsp) {
				System.out.print(" ");
				t++;
			}
			t=1;
			nsp++;
			while(t<=nst) {
				System.out.print("*");
				t++;
			}
			nst--;
			System.out.println();
			row++;
		}
	}
}
