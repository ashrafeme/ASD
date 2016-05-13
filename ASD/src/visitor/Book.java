package visitor;

public class Book implements OrderItem {

	private double price;
	public Book(double price, double weight) {
		super();
		this.price = price;
		this.weight = weight;
	}
	private double weight;
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
