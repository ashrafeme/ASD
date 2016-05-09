package command;

public class SaveCommand implements Command {
	private Database db = new Database();
	private Person person;
	
	public SaveCommand(){
	}
	public SaveCommand(Person person){
	this.person = person;
	}
	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		 return db.savePerson(person);
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return db.removePerson(person);
	}

}
