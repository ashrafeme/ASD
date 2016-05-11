package state.lab;

public class CarControls {
	private Gravel GravelState;
	private Ice IceState;
	private Regular regularState;
	private Wet wetState;
	private RoadState currentRoadState;

	public RoadState getCurrentRoadState() {
		return currentRoadState;
	}

	public Gravel getGravelState() {
		return GravelState;
	}

	public Ice getIceState() {
		return IceState;
	}

	public Regular getRegularState() {
		return regularState;
	}

	public Wet getWetState() {
		return wetState;
	}
}
