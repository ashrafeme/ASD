package factorymethod.lab;

public class DebugToolFactory implements ITraceFactory {

	@Override
	public Trace createTrace(String type) {
		Trace debugtool = null;
		if(type.equals("console"))
			debugtool= new ConsoleTrace();
		if(type.equals("log"))
			debugtool= new FileTrace();
		return debugtool;
	}
}
