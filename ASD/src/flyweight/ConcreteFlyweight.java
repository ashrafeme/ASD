package flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class ConcreteFlyweight implements Flyweight {
	Color color; // only the intrinsic state

	public ConcreteFlyweight(Color color) {
		this.color = color;
	}

	@Override
	public void draw(Graphics g, String string, Color color, int x, int y) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.drawString(string, x, y);
	}
	
	

}
