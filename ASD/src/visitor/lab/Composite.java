package visitor.lab;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite extends Component {

	private List<Component> child = new ArrayList<>();

	public List<Component> getChild() {
		return child;
	}

	public void setChild(List<Component> child) {
		this.child = child;
	}

}
