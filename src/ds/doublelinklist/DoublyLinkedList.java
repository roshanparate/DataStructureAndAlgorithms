package ds.doublelinklist;

public class DoublyLinkedList<T extends Comparable<T>> {
	
	private Node<T> head;
	private Node<T> tail;
	
	public void insert(T data) {
		Node<T> newNode = new Node<>(data);
		if(tail == null) {
			tail =newNode;
			head =newNode;
		}else {
			newNode.setPerviosNode(tail);
			tail.setNextNode(newNode);
			tail = newNode;
		}
	}
	
	public void traverseForward() {
		if(tail == null) return;
		
		Node<T> actualNode = head;
		while(actualNode != null){
			System.out.print(actualNode + " -> ");
			actualNode = actualNode.getNextNode();
		}
	}
	
	public void traverseBackWord() {
		if(tail == null) return;
		
		Node<T> actualNode = tail;
		while(actualNode != null){
			System.out.print(actualNode + " -> ");
			actualNode = actualNode.getPerviosNode();
		}
	}
}
