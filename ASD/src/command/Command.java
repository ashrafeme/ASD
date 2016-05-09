package command;

public interface Command {
	public boolean execute();
	public boolean undo();
}
