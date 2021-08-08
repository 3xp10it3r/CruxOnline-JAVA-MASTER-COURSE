package DataTypes;

import java.util.Scanner;

public class UpperLower {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		System.out.println(ch);
		
		if(ch>=60 && ch<=90) {
			ch+=32;
		}else {
			ch-=32;
		}
		System.out.println(ch);
	}
}
