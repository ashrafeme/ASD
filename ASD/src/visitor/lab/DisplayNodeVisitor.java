package visitor.lab;

import java.util.HashMap;

public class DisplayNodeVisitor implements NodeVisitor {
	HashMap<String, Integer> nodes = new HashMap<>();

	@Override
	public void Visit(Root root) {

	}

	@Override
	public void Visit(Node node) {
		// TODO Auto-generated method stub
	}
	
	public HashMap<String, Integer> getNodesName(){
		return nodes;
	}

}
