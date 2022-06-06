package ds.stack;

public class StackWithGrowableArray<T> {

	private T[] stack;
	private int count;
	
	public StackWithGrowableArray() {
		this.stack = (T[]) new Object[1];
	}

	public T pop() {
		
		if(isEmpty()) return null;
		
		if(count == stack.length) resize(2*count);
		
		T data = stack[--count];
		stack[count] = null;
		
		
		if(count > 0 && count == (stack.length/4)) {
			resize(stack.length/2);
		}
		
		return data;
	}
	
	public void push(T data) {
		
		if(count == stack.length) resize(2*count);
		
		stack[count++] = data;
	}
	
	private void resize(int capacity) {
		T[]  newArr =(T[]) new Object[capacity];
		
		for(int i = 0; i< count; ++i) {
			newArr[i] = stack[i];
		}
		
		stack = newArr;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public int size() {
		return count;
	}
}
