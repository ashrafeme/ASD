package command.lab;

public class UIClient {
	private ICommand command;

    public void SetCommand(ICommand command)
    {
        this.command = command;
    }

    public void ExecuteCommand()
    {
        command.Execute();
    }

    public void UndoCommand()
    {
        command.Undo();
    }
}
