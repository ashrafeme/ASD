package strategy.lab;

import java.util.List;

public class SinglePrice extends PriceModel {

	@Override
	public long getRevenue(List<Flight> flights) {
		long total = 0;
		for (Flight fl : flights) {
			total += fl.getNumberOfpassengers() * getTicketPrice() - getFixedCost();
		}
		return total;
	}

}
