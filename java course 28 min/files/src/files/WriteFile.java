package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteFile {
	
	public static void main(String[] args) throws IOException {
		Path pathFileToWrite = Paths.get("./resources/files-write.txt");
		
		
		List<String> list = List.of("Ant", "Bat", "Cat", "Dog", "Elephant","Fox");
		
		Files.write(pathFileToWrite, list);
		System.out.println("inserted");
	}
}
