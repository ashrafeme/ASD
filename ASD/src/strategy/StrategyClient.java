package strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class StrategyClient {

	public static void main(String[] args) {
		List<File> filesToCompress = getFilesToCompress("C:\files");
		FileCompressor fc = new FileCompressor();
		// choose the best strategy for compression
		// fc.setStrategy(…);
		Archive archive = fc.createArchive(filesToCompress);
		archive.toString();
	}

	public static List<File> getFilesToCompress(String location) {
		// get all files from a location
		List<File> files = new ArrayList<File>();
		// …
		return files;
	}

}
