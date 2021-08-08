package Strings;

public class StringDemo {

	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(str.length() - 1));

		System.out.println(str.substring(1, 3));
		System.out.println(str.substring(2, 5));
		System.out.println(str.substring(3, 3));
		System.out.println(str.substring(3, 4));

		String str2 = "Bye";
		str2 = str2 + str;
		System.out.println(str2);
		System.out.println(str2.concat(str));

		System.out.println(str2.indexOf("hello"));
		System.out.println(str.indexOf("D"));
		
		System.out.println(str2.startsWith("he"));
		System.out.println(str2.startsWith("By"));
		
		
		String s1 = "Hello";
		String s2 = s1;
		String s3 = new String("Hello");
		String s4 = "Hello";
		
		System.out.println((s1==s2) +" , " + s1.equals(s2));
		System.out.println((s1==s3) +" , " + s1.equals(s3));
		System.out.println((s2==s3) +" , " + s2.equals(s3));
		System.out.println((s1==s4) +" , " + s1.equals(s4));
	}
}
