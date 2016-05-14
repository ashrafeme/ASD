package observer.lab;

public class PersonClient {
	public static void main(String[] args) {
		PersonCollection perList = new PersonCollection();

		perList.attach(new DisplayPersonFullName());
		perList.attach(new DisplayPersonLastName());

		Person ahmed = new Person("Ahmed", "Mohamed");
		perList.add(new Person("Ashraf", "Ezzat"));
		System.out.println("------------- ADD -----------------");
		perList.add(ahmed);
		System.out.println("------------- ADD -----------------");
		perList.add(new Person("Ali","Khan"));
		System.out.println("------------- REMOVE -----------------");
		perList.remove(ahmed);
	}
}
