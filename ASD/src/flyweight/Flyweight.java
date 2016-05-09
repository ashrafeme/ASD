package flyweight;

import java.awt.Color;
import java.awt.Graphics;

public interface Flyweight {
	public void draw(Graphics g, String string,	Color color, int x, int y);
}
