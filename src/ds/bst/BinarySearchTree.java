package ds.bst;

public class BinarySearchTree<T extends Comparable<T>>  implements Tree<T>{
	
	private Node<T> root;

	@Override
	public void insert(T data) {
		
		if(root == null) {
			root = new Node<>(data, null);
		}else {
			insert(data, root);
		}
		
	}

	private void insert(T data, Node<T> node) {
		
		if(node.getData().compareTo(data) > 0) {
			if(node.getLeftNode() != null) {
				insert(data,node.getLeftNode());
			}else {
				node.setLeftNode(new Node<T>(data, node));
			}
		}else {
			if(node.getRightNode() != null) {
				insert(data,node.getRightNode());
			}else {
				node.setRightNode(new Node<T>(data, node));
			}
		}
	}

	@Override
	public void remove(T data) {
		
		if(root!=null)
			remove(data, root);
	}

	private void remove(T data, Node<T> node) {
		
		if(node==null) return;
		
		if(data.compareTo(node.getData()) < 0 ) {
			remove(data,node.getLeftNode());
		}else if(data.compareTo(node.getData()) > 0 ) {
			remove(data,node.getRightNode());
		}else {
			// We have found the item
			
			//CASE 1)  if the node is leaf node (without left and right children)
			if(node.getLeftNode() == null && node.getRightNode()==null) {
				System.out.println("Removing node with no child (leaf node)");
				// Whether the node is a left child or right child
				Node<T> parent =  node.getParentNode();
				
				// the node is left node 
				if(parent != null && parent.getLeftNode() == node) {
					parent.setLeftNode(null);
				// the node is right node 
				}else if(parent != null && parent.getRightNode() == node) {
					parent.setRightNode(null);
				}
				
				//maybe the root node is the one we want to remove
				if(parent == null) 
					root=null;
				
				node = null;
				
			// CASE 2) when we remove item with single child (left null and right present)
			}else if(node.getLeftNode() == null && node.getRightNode()!=null) {
				System.out.println("Removing node with single right child");
				Node<T> parent =  node.getParentNode();
				
				// the node is left node
				if(parent != null && parent.getLeftNode() == node) {
					parent.setLeftNode(node.getRightNode());
				// the node is right node 
				}else if(parent != null && parent.getRightNode() == node) {
					parent.setRightNode(node.getRightNode());
				}
				
				//when we dealing with root node
				if(parent == null) {
					root= node.getRightNode();
				}
				
				node.getRightNode().setParentNode(parent);
				node = null;
				
				// CASE 2.1) when we remove item with single child (right null and left present)
			}else if(node.getLeftNode() != null && node.getRightNode() ==null) {
				System.out.println("Removing node with single left child");
				Node<T> parent =  node.getParentNode();
				
				// the node is left node
				if(parent != null && parent.getLeftNode() == node) {
					parent.setLeftNode(node.getLeftNode());
				// the node is right node 
				}else if(parent != null && parent.getRightNode() == node) {
					parent.setRightNode(node.getLeftNode());
				}
				
				//when we dealing with root node
				if(parent == null) {
					root= node.getLeftNode();
				}
				
				node.getLeftNode().setParentNode(parent);
				node = null;
				
			// remove for 2 child
			}else {
				
				System.out.println("Removing node with 2 child....");
				//find predecessor and replace with  
				Node<T> predecessor = getPredecessor(node.getLeftNode());
				
				T temp = predecessor.getData();
				predecessor.setData(node.getData());
				node.setData(temp);
				
				
				remove(data, predecessor);
			}
			
		}
	}

	private Node<T> getPredecessor(Node<T> node) {
		if(node.getRightNode()!= null) {
			return getPredecessor(node);
		}
		
		return node;
	}

	// In-order traversal implementation
	@Override
	public void traversal() {
		
		traversal(root);
		System.out.println("");
	}

	private void traversal(Node<T> node) {
		
		if(node.getLeftNode() != null) {
			traversal(node.getLeftNode());
		}
		
		System.out.print(node.getData()+ "->");
		
		if(node.getRightNode() != null) {
			traversal(node.getRightNode());
		}
	}

	@Override
	public T getMin() {
		
		if(root== null) return null;
		
		return getMin(root);
	}

	private T getMin(Node<T> node) {
		
		if(node.getLeftNode()!= null) {
			return getMin(node.getLeftNode());
		}
		
		return node.getData();
	}

	@Override
	public T getMax() {
		if(root== null) return null;
		
		return getMax(root);
	}

	private T getMax(Node<T> node) {
		
		if(node.getRightNode()!= null) {
			return getMax(node.getRightNode());
		}
		
		return node.getData();
	}

	

	

}
