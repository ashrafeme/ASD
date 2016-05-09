package command.lab;

public class Square {

	public void MoveRight(int positions) {
		System.out.println("Move Right "+positions);
		
	}

	public void UndoMoveRight() {
		System.out.println("Undo Move Right");
		
	}

	public void Create(int side) {
		System.out.println("Create Square "+side);
		
	}

	public void UndoCreate() {
		System.out.println("Undo Create Square");
		
	}

	public void Scale(int scalingFactor) {
		System.out.println("Scale "+scalingFactor);
		
	}

	public void UndoScale() {
		System.out.println("undo Scaling");
		
	}

}
