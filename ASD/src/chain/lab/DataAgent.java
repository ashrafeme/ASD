package chain.lab;


import chain.Request;

public abstract class DataAgent {
	
	protected DataAgent nextAgent;
	
	public abstract void handleRequest(CallRecord callrecord) ;
	
	protected void printHandling(Request req) {
		System.out.println(this + " handling request \"" + req + "\"");
	}
}
