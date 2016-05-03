package abstractfactory.lab;

public class BuildOrder {
	private GiftFactory giftFactory;
	GiftPack giftpack;

	public BuildOrder(GiftPack giftpack) {
		this.giftpack = giftpack;

		switch (giftpack.getPackType()) {
		case BUSINESS:
			giftFactory = new BussinessPackFactory();
			break;
		case ADULTS:
			giftFactory = new AdultsPackFactory();
			break;
		case KIDS:
			giftFactory = new KidsPackFactory();
			break;
		}
		for (GiftItem item : giftpack.getGiftItems()) {
			switch (item.getPackagingType()) {
			case BAG:
				item.setPackaging(giftFactory.createBagGift());
				break;
			case BOX:
				item.setPackaging(giftFactory.createBoxGift());
				break;
			case WARP:
				item.setPackaging(giftFactory.createWrapGift());
				break;
			default:
				break;
			}
		}
	}
	
	public void printPack(){
		for (GiftItem item : giftpack.getGiftItems()) {
			System.out.println(item.getPackaging().getCost());
		}
	}
}
