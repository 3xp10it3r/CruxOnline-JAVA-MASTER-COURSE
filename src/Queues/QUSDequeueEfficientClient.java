package Queues;

public class QUSDequeueEfficientClient {

	public static void main(String[] args) {
		QUSDequeueEfficient queue = new QUSDequeueEfficient();
		
		for(int i = 1 ; i <= 5 ; i++) {
			queue.enqueue(i*10);
		}
		queue.Display();
		queue.dequeue();
		queue.Display();
		System.out.println(queue.front());
	}

}
