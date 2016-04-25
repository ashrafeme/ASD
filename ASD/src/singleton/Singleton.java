package singleton;

public class Singleton {
	
	
private static Singleton instance = null;

private Singleton (){}

	public  static synchronized Singleton getInstance(){
		//EnumSingleton.INSTANCE.print();
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
}
