package flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class ConcreteHeavyweight implements Flyweight {
	private Color color = null; // intrinsic state
	private String string = ""; // extrinsic state
	private int x, y; // extrinsic state

	public ConcreteHeavyweight(String string, Color color, int x, int y) {
		this.string = string;
		this.color = color;
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw(Graphics g, String string, Color color, int x, int y) {
		g.setColor(color);
		g.drawString(string, x, y);

	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
