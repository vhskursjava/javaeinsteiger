package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFiles {

	public static void main(String[] args) throws IOException {
		
		String meinTextFilePfad = ".\\res\\text.txt";
		
		BufferedReader reader = Files.newBufferedReader(Paths.get(meinTextFilePfad), StandardCharsets.UTF_8);
		int lines = 0;
		for(String line; (line = reader.readLine()) != null; ) {
			lines++;
			System.out.println(line);
		}
		System.out.println("Die Datei hatte " + lines + " Zeilen.");
		
		reader.close();
	}

}
