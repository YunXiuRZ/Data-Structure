package hashTableImplement;


class List<LT>{
	
	private ListElement firstElement = null;
	private int length = 0;
	
	public int length() {
		return length;
	}
	
	public void addData(LT t) {
		ListElement e = new ListElement(t);
		if(length == 0) 
			firstElement = e;
		else 
			getElement(length - 1).setNext(e);
		length++;
	}
	
	public void addData(LT t, int index) throws ArrayIndexOutOfBoundsException{
		if(index > length) 
			throw new ArrayIndexOutOfBoundsException();
		ListElement e = new ListElement(t);
		e.setNext(getElement(index));
		if(index == 0) 
			firstElement = e;
		else 
			getElement(index - 1).setNext(e);
		length++;
	}
	
	public LT get(int index) throws ArrayIndexOutOfBoundsException{
		if(index > length) 
			throw new ArrayIndexOutOfBoundsException();
		ListElement accesser = firstElement;
		for(int i = 0; i < index; i++) 
			accesser = accesser.getNext();
		return accesser.getData();
	}
	
	public ListElement getElement(int index) throws ArrayIndexOutOfBoundsException{
		if(index > length) 
			throw new ArrayIndexOutOfBoundsException();
		ListElement accesser = firstElement;
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
		ListElement e = getElement(index - 1);
		e.setNext(getElement(index + 1));
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
	
	class ListElement{
		
		private ListElement nextElement = null;
		private LT data;
		
		public ListElement(LT t){
			data = t;
		}
		
		public void setNext(ListElement e) {
			nextElement = e;
		}
		
		public LT getData() {
			return data;
		}
		
		public ListElement getNext() {
			return nextElement;
		}
		
		public String toString() {
			return data.toString();
		}
	}
}