package hashTableImplement;

public class HashTable<T> {
	
	private int size = 0;
	private int length = 0;
	private List<Element>[] hashTable;
	
	public HashTable(int length) {
		this.length = length;
		hashTable = new List[length];
		for(int i = 0; i < length; i++)
			hashTable[i] = new List<Element>();
	}
	
	public void add(String key, T t) {
		int hashIndex = key.hashCode() % length;
		Element e = new Element(key, t);
		hashTable[hashIndex].addData(e);
		size++;
	}
	
	public T get(String key) {
		int hashIndex = key.hashCode() % length;
		List<Element> positionList = hashTable[hashIndex];
		for(int i = 0; i < positionList.length(); i++) {
			if(positionList.get(i).getKey().equals(key)) {
				return positionList.get(i).getValue();
			}
		}
		return null;
	}
	
	public void remove(String key) {
		int hashIndex = key.hashCode() % length;
		List<Element> positionList = hashTable[hashIndex];
		for(int i = 0; i < positionList.length(); i++) {
			if(positionList.get(i).getKey().equals(key)) {
				size--;
				positionList.remove(i);
			}
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size == 0)
			return true;
		else
			return false;
	}
	
	public int getLength() {
		return length;
	}
	
	class Element{
		
		private String key;
		private T value;
		
		public Element(String k, T v) {
			key = k;
			value = v;
		}
		
		public String getKey() {
			return key;
		}
		
		public T getValue() {
			return value;
		}
		
		public boolean checkKey(String key) {
			if(this.key == key)
				return true;
			else
				return false;
		}
	}
}
