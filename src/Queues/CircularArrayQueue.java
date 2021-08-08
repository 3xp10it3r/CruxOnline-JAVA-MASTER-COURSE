package Queues;

public class CircularArrayQueue {
	private int[] arr;
	private int front;
	private int rear;
	private int cs;
	private int ms;

	public static final int MAX_CAPACITY = 5;

	public CircularArrayQueue() {
		this(MAX_CAPACITY);
	}

	public CircularArrayQueue(int capacity) {
		this.arr = new int[capacity];
		this.cs = 0;
		this.ms = this.arr.length;
		this.front = 0;
		this.rear = 0;
	}

	public boolean isFull() {
		return this.cs == this.ms;
	}

	public boolean isEmpty() {
		return this.cs == 0;
	}

	public void enQueue(int item) {
		if (!this.isFull()) {
			this.arr[this.rear] = item;
			this.rear = (this.rear + 1) % this.arr.length;
			this.cs += 1;
		} else {
			System.out.println("Queue is full");
		}
	}

	public void deQueue() {
		if (!this.isEmpty()) {
			this.front = (this.front + 1) % this.arr.length;
			this.cs -= 1;
		} else {
			System.out.println("Queue is Empty");
		}
	}

	public int getFront() {
		return this.arr[this.front];
	}

	public static void main(String[] args) {
		CircularArrayQueue queue = new CircularArrayQueue();

//		queue.enQueue(1);
//		queue.deQueue();
//		System.out.println(queue.isEmpty());
//		System.out.println(queue.getFront());

		for (int i = 1; i < 6; i++) {
			queue.enQueue(i*10);
		}
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(8);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.getFront());
			queue.deQueue();
		}
	}
}
