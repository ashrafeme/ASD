package abstractfactory.lab;

public class AdultsPackFactory implements GiftFactory {

	@Override
	public AbstractBagGift createBagGift() {
		// TODO Auto-generated method stub
		return new ReusableShopper();
	}

	@Override
	public AbstractBoxGift createBoxGift() {
		// TODO Auto-generated method stub
		return new PlainPaper();
	}

	@Override
	public AbstractWrapGift createWrapGift() {
		// TODO Auto-generated method stub
		return new EverydayValue();
	}

}
