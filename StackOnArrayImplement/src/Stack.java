
public class Stack<T> {
	
	private Object[] stack;
	private int size;
	private int height;
	
	public Stack(int size) {
		stack = new Object[size];
		this.size = size;
		height = 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void push(T t) throws StackOverflowException{
		if(height == size) 
			throw new StackOverflowException();
		stack[height++] = t;
	}
	
	public T pop() throws StackUnderflowException{
		if(height == 0) 
			throw new StackUnderflowException();
		return (T)stack[height-- - 1];
	}
	
	public boolean isEmpty() {
		if(height == 0)
			return true;
		else
			return false;
	}
}

class StackOverflowException extends Exception{}

class StackUnderflowException extends Exception{}