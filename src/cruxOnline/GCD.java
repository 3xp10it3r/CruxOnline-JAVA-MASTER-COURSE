package cruxOnline;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int divisor = scn.nextInt();
		int divident = scn.nextInt();
		int rem;
		while(divident%divisor!=0) {
			rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.println(divisor);

	}

}
