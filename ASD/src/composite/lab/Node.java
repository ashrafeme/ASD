package composite.lab;

import java.util.ArrayList;
import java.util.Collection;

public class Node extends HtmlTree{
	private Collection<HtmlTree> childs = new ArrayList<>();
	public Node(String title) {
		super(title);
		}
//	public void addItem(HtmlTree item){
//		childs.add(item);
//	 }
	@Override
	public void print() {
		System.out.println( "Node name=" + title );
		
		for (HtmlTree item : childs){
		item.print();
		}

		
	}

}
