package Strings;

import java.util.Scanner;

public class StringBuilderDemo {
	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		String b = scn.nextLine();
		StringBuilder s = new StringBuilder(b);
		
		System.out.println(s);
		System.out.println(s.length());
		
		//append
		s.append("abc");
		System.out.println(s);
		
		//insert
		
		s.insert(4, "ew");
		System.out.println(s);
		
		s.insert(s.length(), 'd');
		System.out.println(s);
		
		//deleteCharAt
		s.deleteCharAt(6);
		System.out.println(s);
		
		//update setCharAt
		s.setCharAt(1, 'a');
		System.out.println(s);
		
		//StringBuilder to String
		String sn = s.toString();
		System.out.println(sn);
		
		
	}
}
