package Section9_TimeAndSpace;

public class PowerFun {
	public static void main(String[] args) {
		
		int ans = power(3,6);
		System.out.println(ans);

		ans = poweruptobase(3,6);
		System.out.println(ans);

	}
	
	public static int power(int x , int n ) {
		if(n==1) {
			return x;
		}
		int v = power(x,n/2);
		if(n%2==1) {
			return v*v*x;
		}else {
			return v*v;
		}
	}
	
	// O(log(n))
	public static int poweruptobase(int x , int n ) {
		if(n==0) {
			return 1;
		}
		int v = power(x,n/2);
		if(n%2==1) {
			return v*v*x;
		}else {
			return v*v;
		}
	}
}
