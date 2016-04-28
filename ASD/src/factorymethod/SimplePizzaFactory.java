package factorymethod;

public class SimplePizzaFactory implements PizzaFactory {
	private static PizzaFactory factory = new SimplePizzaFactory();
	private SimplePizzaFactory(){}
	
	public static PizzaFactory getFactory(){
		return factory;
		}

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		if (type.equals("cheese")) {
		pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
		pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
		pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
		pizza = new VeggiePizza();
		}
		return pizza;

	}

}
