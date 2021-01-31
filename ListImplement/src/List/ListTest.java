package List;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new List<String>();
		String a = "Hello";
		String b = "World";
		String c = "!";
		list.addData(a, 0);
		list.addData(b, 1);
		list.addData(c);
		System.out.println(list.toString());
		System.out.println(list.get(2));
		list.remove(1);
		System.out.println(list.toString());
		System.out.println(list.get(2));
	}

}

