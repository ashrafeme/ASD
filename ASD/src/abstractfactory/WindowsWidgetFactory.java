package abstractfactory;

public class WindowsWidgetFactory implements WidgetFactory {

	@Override
	public AbstractFrameWidget createFrame() {
		// TODO Auto-generated method stub
		return  new WindowsFrame();
	}

	@Override
	public AbstractButtonWidget createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	@Override
	public AbstractCheckboxWidget createCheckbox() {
		// TODO Auto-generated method stub
		return new WindowsCheckbox();
	}

	@Override
	public AbstractListboxWidget createListbox() {
		// TODO Auto-generated method stub
		return new WindowsListbox();
	}

}
