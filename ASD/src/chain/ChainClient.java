package chain;

public class ChainClient {

	private ChainBuilder chain;
	public static void main(String[] args) {
		// 
		Request req = new Request();
		//
		req.setRequstType(RequestType.SUPERVISOR );
		
		ChainClient cc = new ChainClient();
		cc.sendRequest(req);
	}
	
	public void sendRequest(Request request) {
		if(chain == null)
			chain = new ChainBuilder();
		chain.getHandler().handleRequest(request);
		}


}
