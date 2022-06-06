package ds.stack;

public class MyLinkedStack<T> {

	private Node<T> head;
	private int count;
	
	
	public boolean isEmpty() {
		if(count == 0) return true;
		
		return false;
	}
	
	public T top() {
		return head.getData();
	}
	
	public void push(T data) {
		count++;
		
		if(isEmpty())
			head = new Node<>(data);
		else {
			Node<T> oldN = head;
			head = new Node<>(data);
			head.setNext(oldN);
		}
	}
	
	public T pop() {
		if(isEmpty()) return null;
		
		T item = head.getData();
		head = head.getNext();
		count --;
		
		return item;
	}

}
