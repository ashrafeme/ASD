package proxy.lab;

public class Table implements ITable {

	private int numrows;

	@Override
	public int numOfRows() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getElementAt(int row, int column) {
		return column;
		// Get the element.
	}

	public void setElementAt(Object element, int row, int column) {
		// Set the element.
	}

	public int getNumberOfRows() {
		return numrows;
	}

	@Override
	public IRow getRow(int rowNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyRow(int rowNum, IRow row) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRow(int rowNum) {
		// TODO Auto-generated method stub

	}

}
