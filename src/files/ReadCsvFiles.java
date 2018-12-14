package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadCsvFiles {

	public static void main(String[] args) throws IOException {
		String meinTextFilePfad = ".\\res\\mock_data.csv";
		
		BufferedReader reader = Files.newBufferedReader(Paths.get(meinTextFilePfad), StandardCharsets.UTF_8);
		for(String line; (line = reader.readLine()) != null; ) {
			String[] csvLine = line.split(",");
			System.out.println(csvLine[1]);
		}
		
		reader.close();
	}

}
