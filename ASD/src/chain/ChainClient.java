package chain;

public class ChainClient {

	private ChainBuilder chain;
	public static void main(String[] args) {
		ChainClient cc = new ChainClient();
		Request req = new Request();
		req.setRequstType(RequestType.MANAGER );
		cc.sendRequest(req);
		
		
	}
	
	public void sendRequest(Request request) {
		if(chain == null)
			chain = new ChainBuilder();
		chain.getHandler().handleRequest(request);
		}


}
