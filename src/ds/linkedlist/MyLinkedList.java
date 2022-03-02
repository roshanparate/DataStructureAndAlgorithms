package ds.linkedlist;

public class MyLinkedList<T extends Comparable<T>> implements List<T> {

	private Node<T> root;
	private int sizeOfList;
	
	@Override
	public void insert(T data) {
		++this.sizeOfList;
		if( root == null){
			this.root = new Node<>(data);
		} else{
			insertDataAtBeginning(data);
		}
	}
	
	//O(1)
	private void insertDataAtBeginning(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(root);
		this.root = newNode;
	}

	//O(n)
	private void insertDataAtEnd(T data, Node<T> node) {
		if(node.getNextNode() != null){
			insertDataAtEnd(data, node.getNextNode());
		}else{
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
	}
	
	@Override
	public void remove(T data) {
		--this.sizeOfList;
		
		if(this.root == null) return;
		
		if(this.root.getData().compareTo(data) ==0){
			this.root = this.root.getNextNode();
		} else{
			 remove(data,root,root.getNextNode());
		}
	}

	private void remove(T dataToRemove, Node<T> priviousNode, Node<T> actualNode) {
		
		while(actualNode != null){
			if(actualNode.getData().compareTo(dataToRemove) == 0){
				priviousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			priviousNode = actualNode;
			actualNode = actualNode.getNextNode();
		}
		
	}

	@Override
	public void traverselist() {
		if(this.root == null) return;
		
		Node<T> actualNode = this.root;
		while(actualNode != null){
			System.out.print(actualNode + " -> ");
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.sizeOfList;
	}


}
