package visitor;

public class Toy implements OrderItem {
	private double price;
	private double weight;
	public Toy(double price, double weight) {
		super();
		this.price = price;
		this.weight = weight;
	}
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
