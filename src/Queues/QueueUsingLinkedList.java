package Queues;

import java.util.LinkedList;

public class QueueUsingLinkedList {

	LinkedList<Integer> queue;
	public QueueUsingLinkedList() {
		queue = new LinkedList<>();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public void enqueue(int data) {
		queue.addLast(data);
	}
	
	public void dequeue() {
		queue.removeFirst();
	}
	
	public int getFront() {
		return queue.getFirst();
	}
	
	public static void main(String[] args) {
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		for(int i = 1 ; i < 6 ; i++) {
			q.enqueue(i*10);
		}
		q.dequeue();
		q.dequeue();
		q.enqueue(8);
		
		while(!q.isEmpty()) {
			System.out.println(q.getFront());
			q.dequeue();
		}
	}
}
