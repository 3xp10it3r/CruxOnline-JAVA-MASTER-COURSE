package DataTypes;

//import java.util.Scanner;
public class DT {

	public static void main(String[] args) {

		byte a = 10;
		short b = 20;
		int in = 100;
		long l = 2000;

//		n=l;
		l = in;
		in = 1000000000;
		l = 10000000000L;
		// implicit conversion only works for byte and short;
		b = 32000;
		a = 100;
		a = (byte) 1000;
		System.out.println(a);

//		float f = 5.5; --> error bcz it is treated as double 
		float f = 5.5f;
		double d = 6.6;

		in = (int) f;
		System.out.println(in);

		f = in;
		System.out.println(f);

		if (true) {
			System.out.println(in);
		}
		boolean bool = false;
		if (bool) {
			System.out.println(bool);
		} else {
			System.out.println(!bool);
		}

		char ch = 'd';
		System.out.println(ch);

		ch = (char) (ch + 2);
		System.out.println(ch);
		
		in = ch;
		System.out.println(in);
		
		ch = 63000;
		System.out.println(ch);
		
		ch = (char)68000;
		System.out.println(ch);
		
		
		System.out.println(10+20+"Hello"+10+20);
		System.out.println(2+' '+5);
		System.out.println(2+" " + 5);
		System.out.println("hello"+'\t'+"world");
		System.out.println("hello"+"\t"+"world");

	}
}
