package memento.lab;


public class Profile {
	CareTaker _caretaker;
    Originator _originator;
    
    public void load(){
    	 _caretaker = new CareTaker();
         _originator = new Originator();
         System.out.println("Load the profile from database");
    }
    
    public void save(){
    	_originator.setExternalizedState("Save to Database");
        _caretaker.add(_originator.saveStateToMemento());
        System.out.println("Save Profile to Database");
    }
    
    public void undo(){
    	Memento m = _caretaker.get(0);
    	_originator.getStateFromMemento(m);
    	System.out.println("undo last state");
    	
    	
    }
}
