package command.lab;

public class Scale implements ICommand {
	 private Square square;
     private int scalingFactor;
     public Scale(Square square, int scalingFactor)
     {
         this.square = square;
         this.scalingFactor = scalingFactor;
     }
	@Override
	public boolean Execute() {
		square.Scale(scalingFactor);
		return false;
	}

	@Override
	public boolean Undo() {
		square.UndoScale();
		return false;
	}

}
