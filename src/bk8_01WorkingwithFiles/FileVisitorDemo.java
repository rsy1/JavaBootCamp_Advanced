package bk8_01WorkingwithFiles;

import java.nio.charset.Charset;
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

public class FileVisitorDemo {
	public static void main(String[] args) {
		Path start = Paths.get("/");
		MyFileVisitor visitor = new MyFileVisitor();
		try {
			Files.walkFileTree(start, visitor);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static class MyFileVisitor extends SimpleFileVisitor<Path> {
		public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
			// System.out.println(file.toString());
			Path path = Paths.get("/home/jonathansiyanata/Downloads/Boot Camp/Weather/directoryFileList.txt");
			//List<String> data = new ArrayList<>();
			try (BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-16"))) {
				writer.flush();
				writer.write(file.toString());				
			} catch (IOException e) {
				// Handle file I/O exception...
				e.printStackTrace();
			}

			return FileVisitResult.CONTINUE;
		}

		public FileVisitResult visitFileFailed(Path file, BasicFileAttributes attr) {
			System.out.println(file.toString() + " COULD NOT ACCESS!");

			return FileVisitResult.CONTINUE;
		}

		public FileVisitResult preVisitDirectoryFailed(Path dir, IOException e) {
			System.out.println(dir.toString() + " COULD NOT ACCESS!");
			return FileVisitResult.CONTINUE;
		}
	}
}