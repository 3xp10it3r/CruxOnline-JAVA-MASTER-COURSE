package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueuePushEfficient {
	private Queue<Integer> primary;
	private Queue<Integer> secondary;
	
	public StackUsingQueuePushEfficient() {
		this.primary = new LinkedList<>();
		this.secondary = new LinkedList<>();
	}
	
	public boolean isEmpty() {
		return this.primary.isEmpty();
	}
	public int size() {
		return this.primary.size();
	}
	
	//O(1) time
	public void push(int item) {
		this.primary.add(item);
	}
	
	//O(n) time
//	public int pop() {
//		if(!this.primary.isEmpty()) {
//			while(this.primary.size() !=1) {
//				this.secondary.add(this.primary.poll());
//			}
//			int rv = this.primary.poll();
//			if
//		}
	}

