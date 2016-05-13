package visitor;

public class ShippingFeeVisitor implements Visitor {
	private double totalShippingFee = 0;

	@Override
	public void visit(Book book) {
		if (book.getPrice() < 10.00) {
			totalShippingFee += book.getWeight() * 2;
		}

	}

	@Override
	public void visit(DVD dvd) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Toy toy) {
		totalShippingFee += 1.5;

	}

	public double getTotalShippingFee() {
		return totalShippingFee;
	}

}
