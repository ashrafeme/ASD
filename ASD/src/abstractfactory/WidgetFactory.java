package abstractfactory;

public interface WidgetFactory {
	public  AbstractFrameWidget createFrame();
	public  AbstractButtonWidget createButton();
	public  AbstractCheckboxWidget createCheckbox();
	public  AbstractListboxWidget createListbox();

}
