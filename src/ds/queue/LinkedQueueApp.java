package ds.queue;

public class LinkedQueueApp {

	public static void main(String[] args) {
		
		QueueLinked<String> queue = new QueueLinked<>();
		
		queue.enqueue("Roshan");
		queue.enqueue("Chetan");
		queue.enqueue("Preyas");
		queue.enqueue("Rohit");
		queue.enqueue("Arun");
		
		System.out.println(queue.size());
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

	}

}
