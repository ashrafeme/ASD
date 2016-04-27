package templatemethod.lab;

public abstract class PrintAlphabet {

	
	public final void PrintLetter(String[][] input) {
		String[][] completeLetter;
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
			completeLetter = input;
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