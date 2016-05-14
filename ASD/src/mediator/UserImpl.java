package mediator;

public class UserImpl extends User {

	public UserImpl(ChatroomMediator med, String name) {
		super(med, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name + ": Sending Message=" + msg);
		mediator.sendMessage(msg, this);

	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + ": Received Message:" + msg);

	}

}
