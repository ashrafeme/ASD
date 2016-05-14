package mediator;

public abstract class User {
	protected ChatroomMediator mediator;
	 protected String name;

	 public User(ChatroomMediator med, String name){
	 this.mediator=med;
	 this.name=name;
	 }

	 public abstract void send(String msg);
	 public abstract void receive(String msg);
}
