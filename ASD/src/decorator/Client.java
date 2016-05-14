package decorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUIContainer decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new Window()));
		System.out.println(decoratedWindow.getDescription());
	}

}
