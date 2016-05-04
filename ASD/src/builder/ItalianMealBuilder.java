package builder;



public class ItalianMealBuilder implements MealBuilder {
	private Meal meal;
	public ItalianMealBuilder() {
		meal = new Meal("Italian Combo");
		}

	@Override
	public void buildDrink() {
	Drink drink = new Drink("red wine");
	meal.setDrink(drink);
	}
	@Override
	public void buildMainDish() {
	MainDish main = new MainDish("pizza");
	meal.setMainDish(main);
	}
	
	@Override
	public Meal getMeal() {
	return meal;
	}

	@Override
	public void buildSideDish() {
		SideDish side = new SideDish("bread");
		meal.setSideDish(side);
	}


}
