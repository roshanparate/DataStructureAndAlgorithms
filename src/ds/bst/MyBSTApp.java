package ds.bst;

import java.util.TreeMap;

public class MyBSTApp {

	public static void main(String[] args) {
		
		BinarySearchTree searchTree =  new BinarySearchTree<>();
		
		searchTree.insert(12);
		searchTree.insert(8);
		searchTree.insert(15);
		searchTree.insert(7);
		searchTree.insert(-1);
		searchTree.insert(20);
		searchTree.insert(55);
		searchTree.insert(9);
		searchTree.insert(0);
		
		System.out.println(searchTree.getMin());
		
		System.out.println(searchTree.getMax());
		
		searchTree.traversal();
		searchTree.remove(-1);
		searchTree.traversal();
		
	}	

}
