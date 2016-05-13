package visitor.lab;

public class Root extends Composite {

	private String name;



	@Override
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.Visit(this);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
