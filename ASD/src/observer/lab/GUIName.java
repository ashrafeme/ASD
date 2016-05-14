package observer.lab;



public interface GUIName {
	public void attach(Observer observer);
	public void detach(Observer observer);
	public void notifyObservers();
}
