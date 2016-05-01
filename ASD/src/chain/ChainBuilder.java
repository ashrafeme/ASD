package chain;

public class ChainBuilder {

	private AbstractAgent handler;
	
	public ChainBuilder(){
		AbstractAgent junior = new JuniorAgent();
		AbstractAgent senior = new SeniorAgent();
		AbstractAgent supervisor = new SupervisorAgent();
		junior.nextAgent = senior;
		senior.nextAgent = supervisor;
		setHandler(junior);
	}

	public AbstractAgent getHandler() {
		return handler;
	}

	public void setHandler(AbstractAgent handler) {
		this.handler = handler;
	}
	
}
