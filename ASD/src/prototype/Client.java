package prototype;

public class Client {

	public static void main(String[] args) {
		Person person1 = new Person("Fred");
		System.out.println("person 1:" + person1);
		Person person2 = (Person) person1.doClone();
		System.out.println("person 2:" + person2);


	}

}
