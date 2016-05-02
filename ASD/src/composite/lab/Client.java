package composite.lab;

public class Client {

	public static void main(String[] args) {
		
			HtmlTree root = new Node("root");
			HtmlTree leaf1 = new Node( "leaf1");
			HtmlTree comp = new Node("composite");
			HtmlTree leaf2 = new Node( "leaf2");
			comp.add(leaf2);
			root.add(leaf1);
			root.add(comp);

	}

}
