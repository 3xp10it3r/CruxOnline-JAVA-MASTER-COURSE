package FunARRAYS;

import java.util.Scanner;

public class ArrayReturn {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int []arr = InputA();
		for(int v : arr) {
			System.out.println(v);
		}
	}
	public static int[] InputA() {
		System.out.println("Enter the array size : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the "+n+" element of array.");
		for(int i = 0 ;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
}
