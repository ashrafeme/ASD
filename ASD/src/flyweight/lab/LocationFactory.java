package flyweight.lab;



public class LocationFactory {

	public static ConcreteLocation getInstance(int x,int y) {
		return new ConcreteLocation();
	}
}
