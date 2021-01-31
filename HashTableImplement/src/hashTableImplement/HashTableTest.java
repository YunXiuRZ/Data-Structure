package hashTableImplement;

public class HashTableTest {

	public static void main(String[] args) {
		HashTable<String> hashTable = new HashTable<String>(5);
		hashTable.add("Joe", "M");
		hashTable.add("Sue", "F");
		hashTable.add("Dan", "M");
		hashTable.add("Nell", "F");
		hashTable.add("Ally", "F");
		hashTable.add("Bob", "M");
		System.out.println(hashTable.get("Dan"));
		System.out.println(hashTable.get("Ally"));
	}

}
