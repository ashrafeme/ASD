package builder.lab;



public class BuilderClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Call md = new Call(new NewCallBuilder());
		md.callPop(new Agent("David"));
	}

}
