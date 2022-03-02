package ds.linkedlist;

public class App {

	public static void main(String... arg){
		MyLinkedList<Integer> linkedList = new MyLinkedList<>();
		linkedList.insert(12);
		linkedList.insert(110);
		linkedList.insert(89);
		linkedList.insert(-652);
		linkedList.insert(55);
		
		System.out.println(linkedList.size());
		
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
	
}
