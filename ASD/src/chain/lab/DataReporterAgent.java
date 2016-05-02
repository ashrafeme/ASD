package chain.lab;

public class DataReporterAgent extends DataAgent {

	@Override
	public void handleRequest(CallRecord callrecord) {
		
		if(callrecord.isValid() && callrecord.isASalesLead()){
			System.out.println("Genderate Report for Record:"+callrecord);
		}else{
			System.out.println("Nothing to do");
		}
	}

}
