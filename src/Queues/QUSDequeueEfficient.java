package Queues;

import java.util.Stack;

public class QUSDequeueEfficient {
	private Stack<Integer> primary;
	private Stack<Integer> secondary;
	private Stack<Integer> temp;

	public QUSDequeueEfficient() {
		this.primary = new Stack<>();
		this.secondary = new Stack<>();
		this.temp = new Stack<>();
	}

	public boolean isEmpty() {
		return this.primary.isEmpty();
	}

	public int size() {
		return this.primary.size();
	}

	public void enqueue(int item) {
		while(!this.primary.isEmpty()) {
			this.secondary.push(this.primary.pop());
		}
		this.primary.push(item);
		while(!this.secondary.isEmpty()) {
			primary.push(secondary.pop());
		}
	}

	public int dequeue() {
		return this.primary.pop();
	}

	public int front() {
		return this.primary.peek();
	}
	
	public void Display() {
		this.temp = this.primary;
		for(int i = this.temp.size()-1 ; i>=0 ; i--) {
			System.out.print(temp.pop() + " ");
		}
		System.out.println("end ");
	}
}
