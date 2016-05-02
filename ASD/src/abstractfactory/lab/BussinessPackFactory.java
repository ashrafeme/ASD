package abstractfactory.lab;

public class BussinessPackFactory implements GiftFactory {

	@Override
	public AbstractBagGift createBagGift() {
		// TODO Auto-generated method stub
		return new MerchantCollection();
	}

	@Override
	public AbstractBoxGift createBoxGift() {
		// TODO Auto-generated method stub
		return new HardPlastic();
	}

	@Override
	public AbstractWrapGift createWrapGift() {
		// TODO Auto-generated method stub
		return new HolidaySurprise();
	}

}
