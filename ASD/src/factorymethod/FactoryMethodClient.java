package factorymethod;

public class FactoryMethodClient {

	public static void main(String[] args) {
		PizzaFactory factory = SimplePizzaFactory.getFactory();
		Pizza pizza = factory.createPizza("cheese");
		//different from below on when the decision has to be made - runtime or compile time?
		//which is one difference between framework and application development
		Pizza pizza1 = new CheesePizza();
		System.out.println(pizza.getClass().getSimpleName());
		System.out.println(pizza1.getClass().getSimpleName());
	}

}
