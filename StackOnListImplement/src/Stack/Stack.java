package Stack;

public class Stack<T> {
	
	private Element lastElement = null;
	private int length = 0; 
	
	public void push(T t) {
		Element e = new Element(t);
		e.setPrevious(lastElement);
		lastElement = e;
		length++;
	}
	
	public T pop() throws StackUnderflowException{
		if(length == 0)
			throw new StackUnderflowException();
		Element returnElement = lastElement;
		lastElement = lastElement.getPrevious();
		length--;
		return returnElement.getData();
	}
	
	public int getLength() {
		return length;
	}
	
	class Element{
		
		private T data;
		private Element previousElement;
		
		public Element(T t) {
			data = t;
		}
		
		public void setPrevious(Element e) {
			previousElement = e;
		}
		
		public Element getPrevious() {
			return previousElement;
		}
		
		public T getData() {
			return data;
		}
	}
}

class StackUnderflowException extends Exception{}