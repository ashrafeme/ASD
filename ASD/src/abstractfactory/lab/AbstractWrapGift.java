package abstractfactory.lab;

import java.math.BigDecimal;

public abstract class AbstractWrapGift implements Packaging{

	protected BigDecimal price;
	public abstract BigDecimal getPrice();
}
