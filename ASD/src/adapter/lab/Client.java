package adapter.lab;

public class Client {

	public static void main(String[] args) {
		
		ITargetStack stack = new Adapter();
		ITargetQueue queue = new Adapter();
		
		stack.push("Ashraf");
		stack.push("David");
		stack.push("Lu");
		queue.queue("Pat");
		stack.print();
		queue.print();
		System.out.println(stack.pop());
		stack.print();
		queue.print();
		queue.queue("Jay");
		queue.queue("Mikel");
		stack.push("Hiteen");
		stack.print();
		queue.print();
		System.out.println(queue.dequeue());
		System.out.println(stack.pop());
		System.out.println(queue.dequeue());
		System.out.println(stack.pop());
		stack.push("Pat");
		queue.print();
		stack.print();
	}

}
