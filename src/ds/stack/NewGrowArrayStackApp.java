package ds.stack;

public class NewGrowArrayStackApp {

	public static void main(String arg[]) {
		
		StackWithGrowableArray<String> linkedStack = new StackWithGrowableArray<>();
		
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
