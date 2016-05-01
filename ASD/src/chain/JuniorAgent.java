package chain;

public class JuniorAgent extends AbstractAgent {

	@Override
	public void handleRequest(Request req) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canHandleRequest(Request req) {
		return (req.getRequstType() == RquestType.JUNIOR);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
