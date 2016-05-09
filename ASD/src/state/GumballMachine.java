package state;

public class GumballMachine {

	private SoldOutState soldOutState;
	private NoQuarterState noQuarterState;
	private HasQuarterState hasQuarterState;
	private SoldState soldState;
	private int count;
	private NoQuarterState state;

	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		// TODO Auto-generated method stub

	}

	public void turnCrank() {
		// TODO Auto-generated method stub

	}

	public void ejectQuarter() {
		// TODO Auto-generated method stub

	}

}
