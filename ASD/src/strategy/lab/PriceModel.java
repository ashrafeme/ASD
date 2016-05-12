package strategy.lab;

import java.util.List;

public abstract class PriceModel {

	private final int fixedCost = 50000;
	private final int ticketPrice = 300;
	
	public abstract long  getRevenue(List<Flight> flights);

	public int getFixedCost() {
		return fixedCost;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}
}
