package ds.linkedlist;

public class App {

	public static <T> void main(String... arg){
		MyLinkedList<Integer> linkedList = new MyLinkedList<>();
		linkedList.insert(12);
		linkedList.insert(110);
		linkedList.insert(89);
		linkedList.insert(-652);
		linkedList.insert(55);
		
		Node n = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		n1.setNextNode(n2);
		n.setNextNode(n1);
		
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		Node n5 = new Node(6);
		n4.setNextNode(n5);
		n3.setNextNode(n4);
		
		System.out.println(linkedList.size());
		
		Node no = appendLists(n,n3);
		Node actualNode = n;
		while(actualNode != null){
			System.out.print(actualNode.getData() + " -> ");
			actualNode = actualNode.getNextNode();
		}
		System.out.println();
		
		linkedList.remove(89);
		
		linkedList.traverselist();
		System.out.println();
		
		
		MyLinkedList<Person> person = new MyLinkedList<>();
		
		person.insert(new Person(20,"John"));
		person.insert(new Person(30,"Amit"));
		Person p = new Person(32,"Ajay");
		person.insert(p);
		person.insert(new Person(20,"Bhushan"));
		person.insert(new Person(19,"Prem"));
		
		
		person.traverselist();
		System.out.println();
		person.remove(p);
		person.traverselist();
		
	}
	
	static Node appendLists (Node list1, Node list2) {
		Node prv = null;
		Node head = list1;
		while(head != null){
			prv = head;
			head = head.getNextNode();
		}

		prv.setNextNode(list2);
		return list1;
	}
}
