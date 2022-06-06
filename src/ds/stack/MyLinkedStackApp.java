package ds.stack;

public class MyLinkedStackApp {

	public static void main(String arg[]) {
		
		MyLinkedStack<String> linkedStack = new MyLinkedStack<>();
		
		linkedStack.push("Roshan");
		linkedStack.push("Ankit");
		linkedStack.push("Rohan");
		linkedStack.push("Chetan");
		linkedStack.push("Vivek");
		
		while(!linkedStack.isEmpty()) {
			System.out.println(linkedStack.pop());
		}
		
	}

}
