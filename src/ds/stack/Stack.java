package ds.stack;

public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long i){
        if(!isFull()) {
            top ++;
            stackArray[top] = i;
        }else{
            System.out.println("Stack is Full..");
        }
    }

    public long pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty..");
            return -1;
        }else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize-1 == top);
    }

    public long peak(){
        return stackArray[top];
    }
}
