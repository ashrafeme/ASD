package bridge;

public abstract class Shape {
	protected DrawingAPI drawAPI;

	protected Shape(DrawingAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();

}
