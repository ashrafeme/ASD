package mediator.lab;



public abstract class User {
	protected Reversi mediator;
	 protected String name;

	 public User(Reversi med, String name){
	 this.mediator=med;
	 this.name=name;
	 }

	 public abstract void send(String msg);
	 public abstract void receive(String msg);
}
