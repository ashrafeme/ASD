package flyweight;

import java.awt.Color;

public class FlyweightFactory {
	static ConcreteFlyweight byColor[] = new ConcreteFlyweight[6];
	static {
		byColor[0] = new ConcreteFlyweight(Color.red);
		byColor[1] = new ConcreteFlyweight(Color.blue);
		byColor[2] = new ConcreteFlyweight(Color.yellow);
		byColor[3] = new ConcreteFlyweight(Color.orange);
		byColor[4] = new ConcreteFlyweight(Color.black);
		byColor[5] = new ConcreteFlyweight(Color.white);
	}

	public static ConcreteFlyweight getInstance(Color color) {
		int i = Math.abs(color.hashCode() % 6);
		ConcreteFlyweight line = byColor[i];
		return line;
	}

	public static ConcreteFlyweight getInstance(int i) {
		return byColor[i];
	}

}
