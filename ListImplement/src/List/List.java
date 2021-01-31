package List;


class List<T>{
	
	private Element firstElement = null;
	private int length = 0;
	
	public int length() {
		return length;
	}
	
	public void addData(T t) {
		Element e = new Element(t);
		if(length == 0) 
			firstElement = e;
		else 
			get(length - 1).setNext(e);
		length++;
	}
	
	public void addData(T t, int index) throws ArrayIndexOutOfBoundsException{
		if(index > length) 
			throw new ArrayIndexOutOfBoundsException();
		Element e = new Element(t);
		e.setNext(get(index));
		if(index == 0) 
			firstElement = e;
		else 
			get(index - 1).setNext(e);
		length++;
	}
	
	public Element get(int index) throws ArrayIndexOutOfBoundsException{
		if(index > length) 
			throw new ArrayIndexOutOfBoundsException();
		Element accesser = firstElement;
		for(int i = 0; i < index; i++) 
			accesser = accesser.getNext();
		return accesser;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < length; i++) {
			String elementData = get(i).toString();
			sb.append(String.format("%d.%s ", i+1, elementData));
		}
		return sb.toString();
	}
	
	public void remove(int index) throws ArrayIndexOutOfBoundsException{
		checkIfIndexExist(index);
		Element e = get(index - 1);
		e.setNext(get(index + 1));
		length--;
	}
	
	public void checkIfIndexExist(int index) throws ArrayIndexOutOfBoundsException{
		if(index >= length || index < 0) 
			throw new ArrayIndexOutOfBoundsException();
	}
	
	public boolean isEmpty() {
		if(length == 0) 
			return true;
		else
			return false;
	}
	
	class Element{
		
		private Element nextElement = null;
		private T data;
		
		public Element(T t){
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
		
		public String toString() {
			return data.toString();
		}
	}
}