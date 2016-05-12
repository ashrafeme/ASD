package strategy.lab;

import java.util.List;

public class MultiClass extends PriceModel {

	@Override
	public long getRevenue(List<Flight> flights) {
		long total = 0;

		for (Flight fl : flights) {

			total += firstClass(fl.getNumberOfpassengers());
			total +=  businessClass(fl.getNumberOfpassengers());
			total +=  calcualateCoach(fl.getNumberOfpassengers());
			total += getFixedCost() * 1.2;
		}
		return total;
	}

	private long businessClass(int numberOfpassengers) {
		int bussinesspassenger = numberOfpassengers / 5;
		return (long) (bussinesspassenger * (getTicketPrice() * 1.5));
	}

	private long firstClass(int numberOfpassengers) {
		int bussinesspassenger = numberOfpassengers / 10;
		return bussinesspassenger * (getTicketPrice() * 4);
	}
	
	private double calcualateCoach(int numberOfpassengers) {
		int bussinesspassenger = (numberOfpassengers * 7) / 10;
		return bussinesspassenger * (getTicketPrice() * 0.75);
	}

	
	
}
