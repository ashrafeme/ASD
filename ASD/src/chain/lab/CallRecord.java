package chain.lab;

public class CallRecord {
	private Customer customer;
	private Agent agent;
	private String requestInformation;
	private boolean isValid;
	private boolean isASalesLead;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public String getRequestInformation() {
		return requestInformation;
	}

	public void setRequestInformation(String requestInformation) {
		this.requestInformation = requestInformation;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public boolean isASalesLead() {
		return isASalesLead;
	}

	public void setASalesLead(boolean isASalesLead) {
		this.isASalesLead = isASalesLead;
	}

	@Override
	public String toString() {
		String result = "";
		if (customer != null)
			result = " Customer" + customer.getLastName() + "," + customer.getFirstName();
		return result;
	}

}
