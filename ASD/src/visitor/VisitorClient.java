package visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<OrderItem> items = new ArrayList<>();
		items.add(new Book(19.99, 1.00));
		items.add(new Book(09.99, 2.00));
		items.add(new DVD(29.99, 3.00));
		items.add(new Toy(39.99, 4.00));
		items.add(new Toy(210.99, 14.00));
		
		ShoppingCart osc = new ShoppingCart();
		osc.setItems(items);
		
		System.out.println("Order Total without Shipping Fee:"+osc.calculateOrderToal());
		System.out.println("Shipping Fee:"+osc.calculateShippingFee());
	}

}
