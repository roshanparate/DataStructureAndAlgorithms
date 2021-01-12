package ds.stack;

public class StackApp {

    public static void main(String[] args){
        Stack myStack = new Stack(10);

        myStack.push(20);
        myStack.push(40);
        myStack.push(60);
        myStack.push(80);
        myStack.push(100);
        myStack.push(120);
        myStack.push(140);
        myStack.push(160);
        myStack.push(180);
        myStack.push(200);
        myStack.push(220);

        System.out.println(myStack.peak());

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}
