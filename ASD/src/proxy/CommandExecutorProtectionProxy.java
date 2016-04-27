package proxy;

public class CommandExecutorProtectionProxy implements ICommandExecutor {

	boolean isAdmin;
	private ICommandExecutor executor;
	public CommandExecutorProtectionProxy(String username,String password){
		if("username".equals(username) && "password".equals(password))
			isAdmin = true;
		executor  = new CommandExecutor();
	}
	@Override
	public void excuteCommand(String cmd) throws Exception {
		if(isAdmin){
			executor.excuteCommand(cmd);
		}else if(cmd.trim().startsWith("ms")){
			throw new Exception("'mstsc' command is not allowed for non-admin users.");
		}else{
			executor.excuteCommand(cmd);
		}
	}

}
