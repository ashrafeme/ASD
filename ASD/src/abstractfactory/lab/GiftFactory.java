package abstractfactory.lab;


public interface GiftFactory {
	public  AbstractBagGift createBagGift();
	public  AbstractBoxGift createBoxGift();
	public  AbstractWrapGift createWrapGift();
}