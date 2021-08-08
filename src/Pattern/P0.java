package Pattern;
import java.util.Scanner;
public class P0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=0;
//		int col=0;
		while(row<n) {
			int col = 0;
			while(col < n) {
				System.out.print("*");
				col+=1;
			}
			System.out.println();
			row+=1;
		}
	}	
}
