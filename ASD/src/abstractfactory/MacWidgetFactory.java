package abstractfactory;

public class MacWidgetFactory implements WidgetFactory {

	@Override
	public AbstractFrameWidget createFrame() {
		// TODO Auto-generated method stub
		return new MacFrame();
	}

	@Override
	public AbstractButtonWidget createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public AbstractCheckboxWidget createCheckbox() {
		// TODO Auto-generated method stub
		return new MacCheckbox();
	}

	@Override
	public AbstractListboxWidget createListbox() {
		// TODO Auto-generated method stub
		return new MacListbox();
	}

}
