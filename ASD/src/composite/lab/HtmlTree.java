package composite.lab;

import java.util.ArrayList;
import java.util.Collection;

public abstract class HtmlTree {
	private Collection<HtmlTree> childs = new ArrayList<>();
	public HtmlTree(String title) {
		super();
		this.title = title;
	}
	protected String title;
	public abstract void print();
	public void add(HtmlTree item){
		childs.add(item);
	 }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
