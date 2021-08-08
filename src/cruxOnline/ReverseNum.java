package cruxOnline;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =  scn.nextInt();
		int ans=0,rem;
		while(n!=0) {
			rem = n%10;
			ans = ans*10 + rem;
			n/=10;
		}
		System.out.println(ans);
	}
}
