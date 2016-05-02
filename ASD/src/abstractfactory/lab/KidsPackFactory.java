package abstractfactory.lab;

public class KidsPackFactory implements GiftFactory {

	@Override
	public AbstractBagGift createBagGift() {
		// TODO Auto-generated method stub
		return new Micky();
	}

	@Override
	public AbstractBoxGift createBoxGift() {
		// TODO Auto-generated method stub
		return new Cartoon();
	}

	@Override
	public AbstractWrapGift createWrapGift() {
		// TODO Auto-generated method stub
		return new HappyKid();
	}

}
