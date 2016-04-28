package templatemethod.lab;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		PrintAlphabet opr = new ConcretePrintAlphabet();
		opr.PrintLetter(SymmetryType.VERTICAL, getFileArrayArray("A.txt",14,5));
		System.out.println();
		System.out.println("================================================================");
		System.out.println();
		opr.PrintLetter(SymmetryType.NONE, getFileArrayArray("B.txt",14,9));
		System.out.println();
		System.out.println("================================================================");
		System.out.println();
		opr.PrintLetter(SymmetryType.HORIZONTAL, getFileArrayArray("C.txt",8,9));
	}

	public static String[][] getFileArrayArray(String filename,int row,int col) {
		ReadFile rf = new ReadFile();
		List<String> lines= rf.readFile(filename);
		
		String[][] result = new String[row][col];
		for (int i = 0; i < lines.size(); i++) {
			String line = lines.get(i);
			for (int j = 0; j < line.length(); j++) {
				result[i][j]= line.charAt(j)+"";
			}
		}
		return result;
	}

}
