package ds.queue;

public class QueueLinked<T> {
	
	private Node<T> first;
	private Node<T> last;
	private int count;
	
	
	public int size() {
		return this.count;
	}
	
	
	public boolean isEmpty() {
		return this.first == null;
	}
	
	public void enqueue(T data) {
		
		count++;
		
		Node<T> oldLast =  this.last;
		this.last = new Node<>(data);
		last.setNext(null);
		
		if(isEmpty()) {
			this.first = this.last;
		}else {
			oldLast.setNext(this.last);
		}
	}

	public T dequeue() {
		
		count--;
		
		T data =  this.first.getData();
		this.first = this.first.getNext();
		
		if(isEmpty()) {
			this.last = null;
		}
		
		return data;
	}
}
