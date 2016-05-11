package state;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("InsertQuarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("no Quarter to Eject");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("please Insert Quarter");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void dispense() {
		System.out.println("please Insert Quarter");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public String toString() {
		return "No Quarter State";
	}

}
