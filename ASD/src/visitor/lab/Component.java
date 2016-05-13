package visitor.lab;

public abstract class Component {
	private String side;

	public abstract void accept(NodeVisitor nodeVisitor);

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public abstract String getName();
}
