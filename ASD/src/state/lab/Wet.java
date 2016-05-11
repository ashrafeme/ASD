package state.lab;

public class Wet implements RoadState {

	@Override
	public void left() {
		System.out.println("left on 4");
	}

	@Override
	public void accel() {
		System.out.println("accel on 9");
	}

	@Override
	public void right() {
		System.out.println("right on 4");

	}

	@Override
	public void brake() {
		System.out.println("breke on 7");

	}

}
