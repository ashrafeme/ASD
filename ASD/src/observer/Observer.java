package observer;

public interface Observer {

	void update(String symbol, float close, float high, float low, long volume);

}
