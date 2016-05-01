package chain;

public abstract class AbstractAgent {

	protected AbstractAgent nextAgent;

	//abstract public void handleRequest(Request req);
	public void handleRequest(Request req) {
		if (!req.isHandled()) {
			if (canHandleRequest(req)) {
				req.markHandled();
				this.printHandling(req);
			} else {
				nextAgent.handleRequest(req);
			}
		}
	}

	abstract public boolean canHandleRequest(Request req);

	protected void printHandling(Request req) {
		System.out.println(this + " handling request \"" + req + "\"");
	}
	@Override
	public abstract String toString();
}
