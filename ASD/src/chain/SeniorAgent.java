package chain;

public class SeniorAgent extends AbstractAgent {

	@Override
	public boolean canHandleRequest(Request req) {
		return (req.getRequstType() == RequestType.SENIOR);
	}

	@Override
	public String toString() {

		return "Senior Agent";
	}

}
