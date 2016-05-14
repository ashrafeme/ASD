package observer.lab;

import java.util.ArrayList;
import java.util.List;

public class PersonCollection implements GUIName {

	List<Observer> observerList;
	List<Person> personList;

	public void add(Person person) {
		if (!personList.contains(person)) {
			personList.add(person);
			notifyObservers();
		}
	}

	public void remove(Person person) {
		int i = personList.indexOf(person);
		if (i >= 0) {
			personList.remove(i);
			notifyObservers();
		}
	}

	public PersonCollection() {
		personList = new ArrayList<>();
		observerList = new ArrayList<>();
	}

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		if (!observerList.contains(observer))
			observerList.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		int i = observerList.indexOf(observer);
		if (i >= 0)
			observerList.remove(i);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observerList) {
			observer.update(personList);
		}

	}

}
