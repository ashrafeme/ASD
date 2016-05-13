package bridge;

public class DrawingAPIImpl1 implements DrawingAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		ExistingDrawingTool1.drawQuadrant(x - radius, y, x, y - radius);
		ExistingDrawingTool1.drawQuadrant(x - radius, y, x, y + radius);
		ExistingDrawingTool1.drawQuadrant(x + radius, y, x, y - radius);
		ExistingDrawingTool1.drawQuadrant(x + radius, y, x, y + radius);
	}

	@Override
	public void drawRectangle(int x, int y, int x2, int y2) {
		ExistingDrawingTool1.drawLine(x, y, x2, y);
		ExistingDrawingTool1.drawLine(x, y, x, y2);
		ExistingDrawingTool1.drawLine(x2, y, x2, y2);
		ExistingDrawingTool1.drawLine(x, y2, x2, y2);
	}

}
