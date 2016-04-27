package proxy;

import java.io.IOException;

public class CommandExecutor implements ICommandExecutor {

	@Override
	public void excuteCommand(String cmd) throws IOException {
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}

}
