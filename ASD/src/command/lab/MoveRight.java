package command.lab;

public class MoveRight implements ICommand {
	private Square square;
    private int positions;

    public MoveRight(Square square, int positions)
    {
        this.square = square;
        this.positions = positions;
    }
	@Override
	public boolean Execute() {
		square.MoveRight(positions);
		return true;
	}

	@Override
	public boolean Undo() {
		square.UndoMoveRight();
		return true;
	}

}
