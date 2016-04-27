package prototype.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

	public static void main(String[] args) {

		Employee emp = createRandomEmployee();

		try {
			Employee emp1 = (Employee) emp.clone();
			System.out.println(emp);
			emp1.setId(50);
			System.out.println(emp);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

	public static Employee createRandomEmployee() {

		Random rand = new Random();
		int id = rand.nextInt(500000);

		return new Employee(id);
	}

	public static Employee[] createRandomStaff() {

		List<Employee> olist = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			olist.add(createRandomEmployee());
		}

		return (Employee[]) olist.toArray();

	}
}