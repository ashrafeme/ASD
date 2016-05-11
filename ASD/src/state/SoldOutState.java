package state;

public class SoldOutState implements State {

	private GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("InsertQuarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter Ejected");
		gumballMachine.setState(gumballMachine.getNoQuarterState());

	}

	@Override
	public void turnCrank() {
		System.out.println("Quarter Ejected");

	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		return "Sold out State";
	}


}
