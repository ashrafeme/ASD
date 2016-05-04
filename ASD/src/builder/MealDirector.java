package builder;

public class MealDirector {
	private MealBuilder mealBuilder = null; // or multiple meal builders

	public MealDirector(MealBuilder mealBuilder) {
		this.mealBuilder = mealBuilder;
	}

	public void constructMeal() {
		mealBuilder.buildDrink();
		mealBuilder.buildMainDish();
		mealBuilder.buildSideDish();
	}

	public Meal getMeal() {
		return mealBuilder.getMeal();
	}

}
