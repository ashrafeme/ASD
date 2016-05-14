package observer.lab;

import java.util.List;

public class DisplayPersonFullName implements Observer {

	@Override
	public void update(List<Person> personList) {
		for (Person person : personList) {
			System.out.println("person FullName:(" + person.getFirstName() + ", " + person.getLastName() + ")");
		}

	}

}
