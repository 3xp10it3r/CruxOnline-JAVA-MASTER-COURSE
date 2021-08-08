package Recursion;

public class Power {
	public static void main(String[] args) {
		int m = Pow(2,0);
	System.out.println(m);
	}
	public static int Pow(int n , int p) {
		if(p==0)
			return 1;
		else if(p==1)
			return n;
		else {
			return n*Pow(n,p-1);
		}
	}
}
