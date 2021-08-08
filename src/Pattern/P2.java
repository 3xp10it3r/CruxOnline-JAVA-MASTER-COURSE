package Pattern;
import java.util.Scanner;
public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1;
		int col=n;
		while(row<=n) {
			int t=1;
			while(t<=col) {
				t++;
				System.out.print("*");
			}
			col--;
			row++;
			System.out.println();
		}
	}	
}
