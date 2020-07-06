package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
	
	public static void main(String[] args) throws IOException {
		Path pathFileToRead = Paths.get("./resources/data.txt");
		Files.readAllLines(pathFileToRead).forEach(System.out::println);
		
		Files.lines(pathFileToRead).forEach(System.out::println);
	}
}
