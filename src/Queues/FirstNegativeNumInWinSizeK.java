package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class FirstNegativeNumInWinSizeK {

	public static void main(String[] args) {

		int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int k = 4;

		Deque<Integer> queue = new LinkedList<>();
		int i;
		for (i = 0; i < k; i++) {
			if (arr[i] < 0) {
				queue.add(i);
			}
		}

		for (; i < arr.length; i++) {
			if (!queue.isEmpty()) {
				System.out.println(arr[queue.getFirst()] + " ");
			} else {
				System.out.println("0 ");
			}
			while (!queue.isEmpty() && queue.getFirst() <= i - k) {
				queue.removeFirst();
			}
			
			if(arr[i]<0) {
				queue.add(i);
			}
		}
		if (!queue.isEmpty()) {
			System.out.println(arr[queue.getFirst()] + " ");
		} else {
			System.out.println("0 ");
		}
	}
}
