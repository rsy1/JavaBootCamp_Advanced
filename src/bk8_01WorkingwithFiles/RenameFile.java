package bk8_01WorkingwithFiles;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		File f = new File("/home/jonathansiyanata/Pictures/Screenshot from 2022-09-08 17-12-13.png");
		if (f.renameTo(new File("/home/jonathansiyanata/Pictures/renamedByJava.png")))
		System.out.println("File renamed.");
		else
		System.out.println("File not renamed.");

	}

}
