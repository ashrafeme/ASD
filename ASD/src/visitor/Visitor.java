package visitor;

public interface Visitor {

	public void visit(Book book);
	public void visit(DVD dvd);
	public void visit(Toy toy);
}
