package mediator.lab;



public class ReversiClient {

	public static void main(String[] args) {
		Reversi mediator = new ReversiImpl();
		 User user1 = new UserImpl(mediator, "Pan");
		 User user2 = new UserImpl(mediator, "Lis");
		 User user3 = new UserImpl(mediator, "Sar");
		 User user4 = new UserImpl(mediator, "Dav");
		 mediator.addUser(user1);
		 mediator.addUser(user2);
		 mediator.addUser(user3);
		 mediator.addUser(user4);

		 user1.send("Hi All");

	}

}
