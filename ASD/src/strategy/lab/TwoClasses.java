package strategy.lab;

import java.util.List;

public class TwoClasses extends PriceModel {

	@Override
	public long getRevenue(List<Flight> flights) {
		long total = 0;

		for (Flight fl : flights) {

			total += calcualateBusiness(fl.getNumberOfpassengers());
			total += calcualateCoach(fl.getNumberOfpassengers());
			total += getFixedCost() * 1.1;
		}
		return total;
	}

	private double calcualateBusiness(int numberOfpassengers) {
		int bussinesspassenger = numberOfpassengers / 3;
		return bussinesspassenger * (getTicketPrice() * 1.5);
	}

	private double calcualateCoach(int numberOfpassengers) {
		int bussinesspassenger = (numberOfpassengers * 2) / 3;
		return bussinesspassenger * (getTicketPrice() * 0.75);
	}

}
