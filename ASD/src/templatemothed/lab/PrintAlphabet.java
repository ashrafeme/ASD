package templatemothed.lab;

public abstract class PrintAlphabet {

	
	public final void PrintLetter(String[][] input) {
		String[][] completeLetter = new String[10][20];
		SymmetryType stype = getSymmetryType(input);
		switch (stype) {
		case VERTICAL:
			completeLetter = printRight(input);
			print(completeLetter);
			break;
		case HORIZONTAL:
			completeLetter = printLower(input);
			print(completeLetter);
			break;
		default:
			print(completeLetter);
			break;
		}
	}
	public abstract void print(String[][] completeLetter);
	public abstract String[][] printRight(String[][] input);
	public abstract String[][] printLower(String[][] input);
	

	private SymmetryType getSymmetryType(String[][] input) {
		// TODO Auto-generated method stub
		return SymmetryType.NONE;
	}

}