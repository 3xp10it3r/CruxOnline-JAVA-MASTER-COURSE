package Queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MaxInWinSizeOfK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		printMax(arr, k);
	}

	public static void printMax(int[] arr, int k) {
		Deque<Integer> d = new LinkedList<>();
		int i =0 ;
		for (; i < k; i++) {
			while (!d.isEmpty() && arr[i] > arr[d.getLast()]) {
				d.removeLast();
			}
			d.addLast(i);
		}
		for (; i < arr.length; i++) {
			System.out.print(arr[d.getFirst()]+"  ");
			while(!d.isEmpty() && d.getFirst() <= i-k ) {
				d.removeFirst();
			}
			while(!d.isEmpty() && arr[i] > arr[d.getLast()]) {
				d.removeLast();
			}
			d.addLast(i);
		}
		System.out.println(arr[d.getFirst()]);
	}
}
