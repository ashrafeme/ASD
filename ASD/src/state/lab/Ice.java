package state.lab;

public class Ice implements RoadState {

	@Override
	public void left() {
		System.out.println("left on 1");
	}

	@Override
	public void accel() {
		System.out.println("accel on 3");
	}

	@Override
	public void right() {
		System.out.println("right on 1");

	}

	@Override
	public void brake() {
		System.out.println("breke on 2");

	}


}
