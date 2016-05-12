package strategy;

import java.io.File;
import java.util.List;

public interface CompressionStrategy {

	public Archive compressFiles(List<File> files);
	
}
