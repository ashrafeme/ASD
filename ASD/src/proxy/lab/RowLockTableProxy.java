package proxy.lab;

public class RowLockTableProxy implements ITable {

	Table realTable;
	Integer[] locks;

	public RowLockTableProxy(Table toLock) {
		realTable = toLock;
		locks = new Integer[toLock.getNumberOfRows()];
		for (int row = 0; row < toLock.getNumberOfRows(); row++)
			locks[row] = new Integer(row);
	}

	public Object getElementAt(int row, int column) {
		synchronized (locks[row]) {
			return realTable.getElementAt(row, column);
		}
	}

	public void setElementAt(Object element, int row, int column) {
		synchronized (locks[row]) {
			realTable.setElementAt(element, row, column);
		}
	}

	public int getNumberOfRows() {
		return realTable.getNumberOfRows();
	}

	@Override
	public int numOfRows() {
		// TODO Auto-generated method stub
		return 0;
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
