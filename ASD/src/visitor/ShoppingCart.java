package visitor;

import java.util.List;

public class ShoppingCart {
	private List<OrderItem> items;

	public double calculateShippingFee() {
		ShippingFeeVisitor shippingVisitor = new ShippingFeeVisitor();
		for (OrderItem item : items) {
			item.accept(shippingVisitor);
		}

		return shippingVisitor.getTotalShippingFee();

	}

	public double calculateOrderToal() {
		OrderPriceVisitor orderVisitor = new OrderPriceVisitor();
		for (OrderItem item : items) {
			item.accept(orderVisitor);
		}

		return orderVisitor.getOrderTotal();

	}
	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
}
