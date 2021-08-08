package LinkedList;

public class LinkedList {
	
	private class Node{
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;
	
	public void display() {
		Node temp = this.head;
		System.out.println("-------------");
		while(temp!=null) {
			System.out.print(temp.data + " ,");
			temp = temp.next;
		}	
//		System.out.println("-------------");
	}
	
	public void addLast(int item) {
		// new node creation
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		//attach
		if(this.size>=1) {
			this.tail.next = nn;
		}
		//Summary Object
		if(this.size ==0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		}else {
			this.tail = nn;
			this.size++;
		}
	}
}
