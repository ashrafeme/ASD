package strategy;

import java.io.File;
import java.util.List;

public class FileCompressor {
	private CompressionStrategy strategy;

	public void setStrategy(CompressionStrategy strategy) {
		this.strategy = strategy;
	}

	public Archive createArchive(List<File> files) {
		return strategy.compressFiles(files);
	}

}
