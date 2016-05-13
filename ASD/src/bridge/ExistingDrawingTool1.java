package bridge;

public class ExistingDrawingTool1 {
	public static void drawLine(int x, int y, int x2, int y2) {
		System.out
				.println("This method draws a line from point1(" + x + "," + y + ") to point2(" + x2 + "," + y2 + ")");
	}

	public static void drawQuadrant(int x, int y, int x2, int y2) {
		System.out.println(
				"This method draws a quarter circle from point1(" + x + "," + y + ") to point2(" + x2 + "," + y2 + ")");
	}
}
