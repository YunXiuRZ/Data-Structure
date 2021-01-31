
public class QueueTest {

	public static void main(String[] args) throws EmptyQueueException{
		Queue<String> queue = new Queue<String>();
		queue.enqueue("Blue");
		queue.enqueue("Green");
		queue.enqueue("Red");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

}
