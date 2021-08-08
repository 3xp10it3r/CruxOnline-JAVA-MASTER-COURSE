package Queues;

import java.util.Deque;
import java.util.LinkedList;
//import java.util.Queue;

public class ReverseQueue {

	public static void main(String[] args) {

		Deque<Integer> queue = new LinkedList<>();

		for (int i = 1; i < 6; i++) {
			queue.add(i * 10);
		}
		System.out.println(queue);
		reverseQueue(queue);
		System.out.println(queue);
	}

	public static void reverseQueue(Deque queue) {
		if (queue.isEmpty()) {
			return;
		}
		int rv = (int) queue.removeFirst();
		reverseQueue(queue);
		queue.add(rv);
	}
}
