package Chain;

public class Request {
	
	 private boolean handled;
	 private RquestType requstType;
	public void markHandled(){
		 this.handled = true;
	 };
	 
	 public boolean isHandled(){
		 return  this.handled;
	 }
	 
	public RquestType getRequstType() {
		return requstType;
	}
	
	public void setRequstType(RquestType requstType) {
		this.requstType = requstType;
	}
	 
	 
}
