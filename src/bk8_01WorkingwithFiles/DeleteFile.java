package bk8_01WorkingwithFiles;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File f = new File("/home/jonathansiyanata/Pictures/renamedByJava.png");
		if (f.delete())
			System.out.println("File deleted.");
		else
			System.out.println("File not deleted.");

	}

}
