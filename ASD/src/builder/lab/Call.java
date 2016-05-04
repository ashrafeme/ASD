package builder.lab;

import java.util.Date;



public class Call {
	private String requestId;
	private IRequestBuilder requestBuilder;

	public Call(IRequestBuilder requestBuilder) {
		this.requestBuilder = requestBuilder;
	}

	public void callPop(Agent agent) {
		this.requestId = "" + (new Date()).getTime();
		requestBuilder.setAgent(agent);
		requestBuilder.setRequestId(this.requestId);
		Customer cus = requestBuilder.getCusomter("05540");
		if(cus == null)
			requestBuilder.createProfile(new Customer("Ashraf"));
		requestBuilder.collectRequestContent("new Problem");
		requestBuilder.answer("problem sovle");
		requestBuilder.setisAnswered(true);
		requestBuilder.setNeedCallback(false);
		requestBuilder.closeCall();
	}

}
