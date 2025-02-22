package ds.bst;

public class Node<T> {
	
	private T data;
	private Node<T> leftNode;
	private Node<T> rightNode;
	
	// it very important while remove node
	private Node<T> parentNode;
	
	public Node(T data, Node<T> parentNode) {
		this.data  = data;
		this.parentNode = parentNode;
	}
	
	

	public T getData() {
		return data;
	}



	public void setData(T data) {
		this.data = data;
	}



	public Node<T> getLeftNode() {
		return leftNode;
	}



	public void setLeftNode(Node<T> leftNode) {
		this.leftNode = leftNode;
	}



	public Node<T> getRightNode() {
		return rightNode;
	}



	public void setRightNode(Node<T> rightNode) {
		this.rightNode = rightNode;
	}



	public Node<T> getParentNode() {
		return parentNode;
	}



	public void setParentNode(Node<T> parentNode) {
		this.parentNode = parentNode;
	}



	@Override
	public String toString() {
		return "" + data;
	}

}
