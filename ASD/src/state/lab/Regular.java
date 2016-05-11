package state.lab;

public class Regular implements RoadState {

	@Override
	public void left() {
		System.out.println("left on 5");
	}

	@Override
	public void accel() {
		System.out.println("accel on 9");
	}

	@Override
	public void right() {
		System.out.println("right on 5");

	}

	@Override
	public void brake() {
		System.out.println("breke on 8");

	}


}
