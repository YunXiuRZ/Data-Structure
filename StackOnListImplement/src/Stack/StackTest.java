package Stack;

public class StackTest {

	public static void main(String[] args) throws StackUnderflowException{
		Stack<String> stack = new Stack<String>();
		stack.push("Blue");
		stack.push("Green");
		stack.push("red");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
