package state.lab;

public class Gravel implements RoadState {

	// private CarControls carControls;
	//
	// public Gravel(CarControls carControls){
	// this.carControls = carControls;
	// }
	@Override
	public void left() {
		System.out.println("left on 3");
	}

	@Override
	public void accel() {
		System.out.println("accel on 7");
	}

	@Override
	public void right() {
		System.out.println("right on 3");

	}

	@Override
	public void brake() {
		System.out.println("breke on 4");

	}

}
