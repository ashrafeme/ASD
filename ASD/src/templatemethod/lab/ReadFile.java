package templatemethod.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

	public List<String> readFile(String filepath) {
		List<String> list = new ArrayList<>();
		try {
			URL url = getClass().getResource(filepath);
			File file = new File(url.getPath());
			Scanner in = new Scanner(new FileReader(file));
			while (in.hasNext()) {
				list.add(in.next());
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

}
