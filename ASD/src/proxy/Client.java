package proxy;

public class Client {

	public static void main(String[] args){

		ICommandExecutor ic = new CommandExecutorProtectionProxy("username", "password");
		try {
			ic.excuteCommand("cmd");
			ic.excuteCommand("print");
			ic.excuteCommand("mstsc");
			ic.excuteCommand("notepad");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
