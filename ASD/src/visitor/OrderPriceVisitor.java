package visitor;

public class OrderPriceVisitor implements Visitor {
	private double totalPrice = 0.0;

	@Override
	public void visit(Book book) {
		totalPrice += book.getPrice();

	}

	@Override
	public void visit(DVD dvd) {
		totalPrice += dvd.getPrice();

	}

	@Override
	public void visit(Toy toy) {
		totalPrice += toy.getPrice();

	}

	public double getOrderTotal() {
		return totalPrice;
	}
}
