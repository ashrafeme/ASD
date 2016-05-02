package chain.lab;

public class DataWasherAgent extends DataAgent {

	@Override
	public void handleRequest(CallRecord callrecord) {
		if (callrecord.isValid()) {
			callrecord.setASalesLead(true);
			System.out.println("DataWasher is proccessing the Record");
			nextAgent.handleRequest(callrecord);
		} else {
			// do Nothing
		}

	}

}
