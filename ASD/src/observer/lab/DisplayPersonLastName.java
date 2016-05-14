package observer.lab;

import java.util.List;

public class DisplayPersonLastName implements Observer {

	@Override
	public void update(List<Person> personList) {
		for (Person person : personList) {
			System.out.println("person LastName:(" + person.getLastName() + ")");
		}

	}

}
