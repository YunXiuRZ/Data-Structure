
public class Queue<T> {
	
	private int height = 0;
	private Element firstElement = null;
	private Element lastElement = null;
	
	public void enqueue(T t) {
		Element e = new Element(t);
		if(height == 0) {
			firstElement = e;
		}else {
			lastElement.setNext(e);
		}
		lastElement = e;
		height++;
	}
	
	public T dequeue() throws EmptyQueueException{
		if(height == 0)
			throw new EmptyQueueException();
		Element returnElement = firstElement;
		firstElement = firstElement.getNext();
		height--;
		return returnElement.getData();
	}
	
	public boolean isEmpty() {
		if(height == 0)
			return true;
		else
			return false;
	}
	
	public int getHeight() {
		return height;
	}
	
	class Element{
		
		private T data;
		private Element nextElement;
		
		public Element(T t) {
			data = t;
		}
		
		public void setNext(Element e) {
			nextElement = e;
		}
		
		public T getData() {
			return data;
		}
		
		public Element getNext() {
			return nextElement;
		}
	}
}

class EmptyQueueException extends Exception{}