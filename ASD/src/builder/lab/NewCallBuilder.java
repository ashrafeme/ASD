package builder.lab;

public class NewCallBuilder implements IRequestBuilder {

	public NewCallBuilder() {
		request = new Request();
	}

	Request request;

	@Override
	public Customer getCusomter(String phone) {
		// TODO Auto-generated method stub
		return new Customer(phone);
	}

	@Override
	public void createProfile(Customer customer) {
		// TODO Auto-generated method stub
		customer = new Customer("new Customer");
		request.setRequester(customer);
	}

	@Override
	public void collectRequestContent(String content) {
		request.setReqContent(content);

	}

	@Override
	public void answer(String content) {
		request.setRespContent(content);

	}

	@Override
	public void setisAnswered(boolean answered) {
		request.setAnswered(answered);

	}

	@Override
	public void setNeedCallback(boolean answered) {
		request.setNeedCallBack(answered);

	}

	@Override
	public void closeCall() {

		System.out.println("Closing the request and save to Database");

	}

	@Override
	public void setRequestId(String id) {
		request.setReqId(id);

	}

	@Override
	public void setAgent(Agent agent) {
		request.setAgent(agent);

	}

}
