package factorymethod.lab;

public class FactoryClient {

	public static void main(String[] args) {

		ITraceFactory tf = new DebugToolFactory();

		Trace debugtool = tf.createTrace(args[0]);
		debugtool.debug("Hello");
		debugtool.error("Error");
	}
}
