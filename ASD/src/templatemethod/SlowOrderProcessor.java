package templatemethod;

public class SlowOrderProcessor extends AOrderProcessor {

	@Override
	public float getShippingFee(IOrder order) {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int getShippingTime(IOrder order) {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public void sendConfirmation(String orderDetails, float shippingFee, int shippingTime) {
		// TODO Auto-generated method stub

	}

}
