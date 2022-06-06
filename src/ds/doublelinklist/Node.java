package ds.doublelinklist;

public class Node<T extends Comparable<T>> {
	private T data;
	private Node<T> nextNode; 
	private Node<T> perviosNode;
	
	public Node(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	public Node<T> getPerviosNode() {
		return perviosNode;
	}
	public void setPerviosNode(Node<T> perviosNode) {
		this.perviosNode = perviosNode;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
}
