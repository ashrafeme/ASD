package flyweight.lab;

public class ConcreteLocation implements Ilocation {

	@Override
	public Image getlocationMap(int x, int y) {
		// TODO Auto-generated method stub
		return new Image(x,y);
	}

}
