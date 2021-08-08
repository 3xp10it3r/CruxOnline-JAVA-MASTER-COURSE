package cruxOnline;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		int n = scn.nextInt();
		int c=2;
		boolean flag=true;
		while(c<n) {
			if(n%c==0) {
				flag=false;
				break;
			}
			c+=1;
		}
		if(flag) {
			System.out.println("prime");
		}else {
			System.out.println("Not prime");
		}
	}

}
