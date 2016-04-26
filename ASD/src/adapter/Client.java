package adapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Target target = new Adapter();
		
		target.push("Ashraf");
		target.push("David");
		target.push("Lu");
		target.push("Pat");
		target.print();
		System.out.println(target.pop());
		target.print();
		target.push("Jay");
		target.push("Mikel");
		target.push("Hiteen");
		target.print();
		System.out.println(target.pop());
		System.out.println(target.pop());
		System.out.println(target.pop());
		System.out.println(target.pop());
		target.push("Pat");
		target.print();
	}

}
