package visitor.lab;

public class DisplayTree {

	Composite trees = new Root();

	public void DisplayName() {
		NodeVisitor visitor = new DisplayNodeVisitor();
		for (Component item : trees.getChild()) {
			item.accept(visitor);
		}
	}

}
