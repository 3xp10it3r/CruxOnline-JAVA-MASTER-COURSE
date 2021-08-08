package Recursion;

public class FactoriaL {
	public static void main(String[] args) {
		int m = Fact(5);
	System.out.println(m);
	}
	public static int Fact(int n ) {
		if(n==0 || n==1) {
			return 1;
		}else
			return n*(Fact(n-1));
	}
}
