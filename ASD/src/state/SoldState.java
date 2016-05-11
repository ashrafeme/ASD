package state;

public class SoldState implements State {

	private GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("only one quarter");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("only one quarter");

	}

	@Override
	public void turnCrank() {
		System.out.println("your gumball in the way");
		gumballMachine.setCount( gumballMachine.getCount()-1);
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		return "Sold State";
	}


}
