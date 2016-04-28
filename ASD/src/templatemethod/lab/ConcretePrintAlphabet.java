package templatemethod.lab;

public class ConcretePrintAlphabet extends PrintAlphabet {

	@Override
	public String[][] printVertical(String[][] input) {
		String[][] result = new String[20][10];
		copyArray(input, result);
		for (int i = 0; i < input.length; i++)
			for (int j = 0; j < input[i].length; j++) {
				result[i][(result[i].length-1)-j] = input[i][j];
			}
		return result;
	}

	@Override
	public String[][] printHorizontal(String[][] input) {
		String[][] result = new String[20][10];
		copyArray(input, result);
		for (int i = input.length-1; i >=0 ; i--)
			for (int j = 0; j < input[i].length; j++) {
				result[(input.length-1)+(input.length-i)][j] = input[i][j];
			}
		return result;
	}
	
	@Override
	public String[][] printNone(String[][] input) {
		String[][] result = new String[20][10];
		copyArray(input, result);
		return result;
	}

	private void copyArray(String[][] input, String[][] complete) {
		for (int i = 0; i < input.length; i++)
			for (int j = 0; j < input[i].length; j++) {
				complete[i][j] = input[i][j];
			}
	}

	

}
