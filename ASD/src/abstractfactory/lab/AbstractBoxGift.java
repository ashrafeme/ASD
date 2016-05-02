package abstractfactory.lab;

import java.math.BigDecimal;

public abstract class AbstractBoxGift implements Packaging{

	protected BigDecimal price;
	public abstract BigDecimal getPrice();
}
