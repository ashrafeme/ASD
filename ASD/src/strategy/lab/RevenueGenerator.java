package strategy.lab;

import java.util.List;

public class RevenueGenerator {

	private PriceModel priceStrategy;

	public void setStrategy(PriceModel strategy) {
		this.priceStrategy = strategy;
	}

	public long createArchive(List<Flight> flights) {
		return priceStrategy.getRevenue(flights);
	}
}
