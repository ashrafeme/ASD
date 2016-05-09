package memento.lab;

public class Originator {
	private String externalizedState;

	public void setExternalizedState(String externalizedState) {
		this.externalizedState = externalizedState;
	}

	public Memento saveStateToMemento() {
		return new Memento(externalizedState);
	}
	
	public void getStateFromMemento(Memento memento){
		externalizedState = memento.getState();
	}

}
