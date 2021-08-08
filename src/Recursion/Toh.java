package Recursion;

public class Toh {
	public static void main(String[] args) {
		int  n = 4;
		toh(n, "src", "helper", "dest");
	}
	
	public static void toh(int n , String src , String helper , String dest) {
		if(n==0)
			return;
		toh(n-1,src,dest,helper);
		System.out.println("move "+  n+ "th disc from "+src+" to "+dest);
		toh(n-1,helper,src,dest);
	}
}
