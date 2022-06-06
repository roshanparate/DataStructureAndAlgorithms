package ds.doublelinklist;

public class App {

	public static void main(String[] args) {
		
		DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
		
		doublyLinkedList.insert(50);
		doublyLinkedList.insert(99);
		doublyLinkedList.insert(87);
		doublyLinkedList.insert(120);
		doublyLinkedList.insert(85);
		
		doublyLinkedList.traverseForward();
		System.out.println();
		doublyLinkedList.traverseBackWord();
	}

}
