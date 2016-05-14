package decorator;

public class HorizontalScrollBarDecorator extends WindowDecorator {

	public HorizontalScrollBarDecorator(GUIContainer windowToBeDecorated) {
		super(windowToBeDecorated);
	}

	@Override
	public void paint() {
		super.paint();
		paintHorizontalScrollBar();
	}

	private void paintHorizontalScrollBar() {
		// implementation
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", adding horizontal scrollbar";
	}

}
