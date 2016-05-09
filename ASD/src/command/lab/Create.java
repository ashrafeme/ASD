package command.lab;

public class Create implements ICommand {

	private Square square;
    private int side;
    public Create(Square square, int side)
    {
        this.square = square;
        this.side = side;
    }
	@Override
	public boolean Execute() {
		square.Create(side);
		return false;
	}

	@Override
	public boolean Undo() {
		square.UndoCreate();
		return false;
	}

}
