package observer;

public class ObserverClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("-- Stock Quote Application --");
		System.out.println();
		StockData stockData = new StockData();
		// register observers...
		new SmallBuyer(stockData);
		new BigBuyer(stockData);
		// generate changes to stock data...
		stockData.setStockData("JUPM", 16.10f, 16.15f, 15.34f, (long) 481172);
		stockData.setStockData("SUNW", 4.84f, 4.90f, 4.79f, (long) 68870233);
		stockData.setStockData("MSFT", 23.17f, 23.37f, 23.05f, (long) 75091400);

	}

}
