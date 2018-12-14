package files;

import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFiles {

	public static void main(String[] args) throws IOException {
		String meineTextdatei = ".\\res\\meinetextdatei.txt";
		
		Writer writer = Files.newBufferedWriter(Paths.get(meineTextdatei), 
							StandardCharsets.ISO_8859_1, 
							StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
		
		writer.write("Treffen sich zwei Jäger...");
		writer.write(System.lineSeparator());
		writer.write("Ich bin eine Zeile in einer Textdatei!\n");
		writer.write("Ich bin die letzte Zeile!");
		
		writer.close();
	}

}
