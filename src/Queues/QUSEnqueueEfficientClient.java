package Queues;

public class QUSEnqueueEfficientClient {
	public static void main(String[] args) {
		QUSEnqueueEfficient queue = new QUSEnqueueEfficient();

		for (int i = 1; i < 6; i++) {
			queue.enqueue(i * 10);
		}
		queue.dequeue();
		queue.Display();
		System.out.println(queue.Front());
	}
}
