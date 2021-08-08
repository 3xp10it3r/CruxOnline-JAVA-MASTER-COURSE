package Pattern;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1;
//		int col=1;
		while(row<=n) {
			int t=1;
			while(t<=row) {
				System.out.print("*");
				t++;
			}
			row++;
			System.out.println();
		}
	}
}
