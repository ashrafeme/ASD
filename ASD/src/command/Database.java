package command;

// this is the receiver
public class Database {

	public boolean savePerson(Person person) {
		System.out.println("Saving person to Database:" + person);
		return true;
	}

	public boolean removePerson(Person person) {
		System.out.println("removing person to Database:" + person);
		return true;
	}

}
