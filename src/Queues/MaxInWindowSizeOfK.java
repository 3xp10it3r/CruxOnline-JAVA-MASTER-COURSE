package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class MaxInWindowSizeOfK {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 34, 3, 5, 6, 7, 2, 4 };
		printMax(arr, 3);
	}

	public static void printMax(int[] arr, int k) {
		Deque<Integer> q = new LinkedList<>();

		int i;
		for (i = 0; i < k; i++) {
			while (!q.isEmpty() && arr[i] > arr[q.getLast()]) {
				q.removeLast();
			}
			q.addLast(i);
		}

		for (; i < arr.length; i++) {
			System.out.println(arr[q.getFirst()] + " ");
			while (!q.isEmpty() && q.getFirst() <= i - k) {
				q.removeFirst();
			}
			while (!q.isEmpty() && arr[i] > arr[q.getLast()]) {
				q.removeLast();
			}
			q.addLast(i);
		}
		System.out.println(arr[q.getFirst()]);
	}
}
