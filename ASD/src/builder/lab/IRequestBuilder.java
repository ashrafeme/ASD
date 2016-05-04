package builder.lab;

public interface IRequestBuilder {

	void setRequestId(String id);
	void setAgent(Agent agent);
	Customer getCusomter(String phone);
	void createProfile(Customer customer);
	void collectRequestContent(String content);
	void answer(String content);
	void setisAnswered(boolean answered);
	void setNeedCallback(boolean answered);
	void closeCall();
}