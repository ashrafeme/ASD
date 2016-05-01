package chain;

public class SupervisorAgent extends AbstractAgent {

	@Override
	public boolean canHandleRequest(Request req) {
		return (req.getRequstType() == RequestType.SUPERVISOR);
	}

	@Override
	public String toString() {
		return "Supervisor Agent";
	}

}
