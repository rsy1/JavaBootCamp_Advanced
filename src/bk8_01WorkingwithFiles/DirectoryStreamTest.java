package bk8_01WorkingwithFiles;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest {

	public static void main(String[] args) {
		Path dir = Paths.get("/home/jonathansiyanata");
		try {
			DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
			for (Path entry : stream)
				System.out.println(entry.toString());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}