package observer;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class SmallBuyer implements Observer {
	private String symbol;
	private float close;

	public SmallBuyer(Subject stockData) {
		stockData.attach(this);
	}

	@Override
	public void update(String symbol, float close, float high, float low, long volume) {
		// TODO Auto-generated method stub
		this.symbol = symbol;
		this.close = close;

		display();

	}

	private void display() {
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		DecimalFormat priceFormat = new DecimalFormat("###.00", dfs);
		System.out.println("Trading Fool says... ");
		System.out.println("\t" + symbol + " is currently trading at $" + priceFormat.format(close) + " per share.");
		System.out.println();
	}

}
