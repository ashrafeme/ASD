package abstractfactory;

public interface WidgetFactory {
	public abstract AbstractFrameWidget createFrame();
	public abstract AbstractButtonWidget createButton();
	public abstract AbstractCheckboxWidget createCheckbox();
	public abstract AbstractListboxWidget createListbox();

}
