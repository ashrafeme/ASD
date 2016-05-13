package bridge;

public class Rectangle extends Shape {

	private int x, y, x2, y2;

	public Rectangle(int x, int y, int x2, int y2, DrawingAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
	}

	public void draw() {
		drawAPI.drawRectangle(x, y, x2, y2);
	}

}
