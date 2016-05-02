package chain.lab;

public class ChainBuilder {

	private DataAgent handler;
	
	public ChainBuilder(){
		DataValidatorAgent validator = new DataValidatorAgent();
		DataWasherAgent datawasher = new DataWasherAgent();
		DataReporterAgent datareporter = new DataReporterAgent();
		validator.nextAgent = datawasher;
		datawasher.nextAgent = datareporter;
		setHandler(validator);
	}

	public DataAgent getHandler() {
		return handler;
	}

	public void setHandler(DataAgent handler) {
		this.handler = handler;
	}
	
}
