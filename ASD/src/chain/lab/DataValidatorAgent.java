package chain.lab;

public class DataValidatorAgent extends DataAgent {

	@Override
	public void handleRequest(CallRecord callrecord) {

		if (isRecordValide(callrecord)) {
			callrecord.setValid(true);
			nextAgent.handleRequest(callrecord);
		} else {
			addCallRecordToDiscaredRequest(callrecord);
		}
	}

	public void addCallRecordToDiscaredRequest(CallRecord callrecord) {
		System.out.println("Discared Record :" + callrecord);
	}

	public boolean isRecordValide(CallRecord callrecord) {
		return (callrecord != null 
				&& callrecord.getCustomer() != null 
				&& callrecord.getCustomer().getAddress() != null
				&& callrecord.getCustomer().getPhone() != null 
				&& callrecord.getCustomer().getEmail() != null);
	}
}
