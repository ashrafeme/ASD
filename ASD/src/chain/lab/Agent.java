package chain.lab;

public class Agent {
	
	public Agent(String agentId, Address workLocation) {
		super();
		this.agentId = agentId;
		this.workLocation = workLocation;
	}
	public Agent() {
		this(null,null);
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public Address getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(Address workLocation) {
		this.workLocation = workLocation;
	}
	private String agentId;
	private Address workLocation;
	
}
