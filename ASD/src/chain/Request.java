package chain;

public class Request {

	private boolean handled;
	private RequestType requstType;

	public void markHandled() {
		this.handled = true;
	};

	public boolean isHandled() {
		return this.handled;
	}

	public RequestType getRequstType() {
		return requstType;
	}

	public void setRequstType(RequestType requstType) {
		this.requstType = requstType;
	}

	@Override
	public String toString() {
		String rqtype = "";
		switch (requstType) {
		case JUNIOR:
			rqtype = "JUNIOR";
			break;
		case SENIOR:
			rqtype = "SENIOR";
			break;
		default:
			rqtype = "SUPERVISOR";
			break;
		}
		return "Request Type (" + rqtype + ")";
	}

}
