package templatemethod.lab;

public abstract class PrintAlphabet {

	
	public final void PrintLetter(SymmetryType stype,String[][] input) {
		String[][] completeLetter;
		//SymmetryType stype = getSymmetryType(input);
		switch (stype) {
		case VERTICAL:
			completeLetter = printVertical(input);
			print(completeLetter);
			break;
		case HORIZONTAL:
			completeLetter = printHorizontal(input);
			print(completeLetter);
			break;
		default:
			completeLetter = printNone(input);
			print(completeLetter);
			break;
		}
	}
	public void print(String[][] completeLetter){
		for (int i = 0; i < completeLetter.length; i++) {
			for (int j = 0; j < completeLetter[i].length; j++) {
				System.out.print(completeLetter[i][j]==null?"-":completeLetter[i][j]);
			}
			System.out.println();
		}
	}
	public abstract String[][] printVertical(String[][] input);
	public abstract String[][] printHorizontal(String[][] input);
	public abstract String[][] printNone(String[][] input);
	

}