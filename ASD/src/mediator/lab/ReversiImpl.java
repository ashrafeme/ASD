package mediator.lab;

import java.util.ArrayList;
import java.util.List;

public class ReversiImpl implements Reversi {

	private List<User> users;

	public ReversiImpl() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void sendMessage(String msg, User user) {
		for (User u : this.users) {
			// message should be sent to all colleagues except him/herself
			if (u != user) {
				u.receive(msg);
			}
		}
	}

}
