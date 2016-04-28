package prototype.lab;

import java.util.Random;

public class Client {

	public static void main(String[] args) {

		Employee emp = createRandomEmployee();
		emp.setStaff(createRandomStaff(emp));
		emp.setSupervisor(createRandomEmployee());
		try {
			Employee emp1 = (Employee) emp.clone();
			System.out.println(emp);
			//emp1.setId(50);
			System.out.println(emp1);
			for (Employee staffEmp : emp1.getStaff()) {
				System.out.println(staffEmp);
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	public static Employee createRandomEmployee() {
		Employee emp = new Employee();
		Random rand = new Random();
		emp.setId(rand.nextInt(500000));
		emp.setStreetAddress("1000 N 4th");
		emp.setFirstname("Ashraf");
		emp.setLastname("Ezzat");
		emp.setCity("Fairfield");
		emp.setState("IA");
		emp.setZipcode("52557");
		return emp;
	}

	public static Employee[] createRandomStaff(Employee supervisor) {
		Employee[] olist = new Employee[10];
		for (int i = 0; i < olist.length; i++) {
			olist[i] = createRandomEmployee();
			olist[i].setSupervisor(supervisor);
		}
		return olist;
	}
}