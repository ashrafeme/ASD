package chain.lab;

public class ChainClient {

	private ChainBuilder chain;

	public static void main(String[] args) {
		ChainClient cc = new ChainClient();
		CallRecord req = new CallRecord();
		cc.sendRequest(req);
	}

	public void sendRequest(CallRecord request) {
		if (chain == null)
			chain = new ChainBuilder();
		chain.getHandler().handleRequest(request);
	}

}
