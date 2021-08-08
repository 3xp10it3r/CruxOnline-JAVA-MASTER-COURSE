package Queues;

import java.util.Stack;

public class QUSEnqueueEfficient {
	private Stack<Integer> primary;
	private Stack<Integer> secondry;
	
	public QUSEnqueueEfficient() {
		// TODO Auto-generated constructor stub
		primary = new Stack<>();
		secondry = new Stack<>();
	}
	public int size() {
		return primary.size();
	}
	public boolean isEmpty() {
		return primary.isEmpty();
	}
	public void enqueue(int item) {
		primary.push(item);
	}
	public int dequeue() {
		while(primary.size()!=1) {
			secondry.push(primary.pop());
		}
		int rv = primary.pop();
		while(!secondry.isEmpty()) {
			primary.push(secondry.pop());
		}
		return rv;
	}
	
	public int Front() {
		while(primary.size()!=1) {
			secondry.push(primary.pop());
		}
		int rv = primary.peek();
		while(!secondry.isEmpty()) {
			primary.push(secondry.pop());
		}
		return rv;
	}
	public void Display() {
		reverseStack(primary, secondry,0);
		System.out.println(primary);
		reverseStack(primary, secondry, 0);
	}
	
	public static void reverseStack(Stack primary , Stack secondary , int index) {
		if(primary.isEmpty()) {
			return;
		}
		int rv = (int)primary.pop();
		reverseStack(primary, secondary,index+1);
		secondary.push(rv);
		if(index==0) {
			while(!secondary.isEmpty()) {
				primary.push(secondary.pop());
			}
		}
	}
}
