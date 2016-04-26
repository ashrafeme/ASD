package adapter.lab;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITargetStack stack = new Adapter();
		ITargetQueue queue = new Adapter();
		
		stack.push("Ashraf");
		stack.push("David");
		stack.push("Lu");
		stack.push("Pat");
		stack.print();
		System.out.println(stack.pop());
		stack.print();
		stack.push("Jay");
		stack.push("Mikel");
		stack.push("Hiteen");
		stack.print();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push("Pat");
		stack.print();
	}

}
