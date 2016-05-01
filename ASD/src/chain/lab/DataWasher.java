package chain.lab;

public class DataWasher extends DataAgent {

	@Override
	public void handleRequest(CallRecord callrecord) {
		if (callrecord.isValid()) {
			callrecord.setASalesLead(true);
			nextAgent.handleRequest(callrecord);
		} else {
			// do Nothing
		}

	}

}
