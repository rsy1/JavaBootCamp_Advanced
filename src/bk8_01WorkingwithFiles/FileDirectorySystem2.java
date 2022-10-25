package bk8_01WorkingwithFiles;

//Illustrtion : program lists only files, not subdirectories, nnd doesn’t list hidden files:

import java.io.File;

public class FileDirectorySystem2 {

	public static void main(String[] args) {
		String path = "/home/jonathansiyanata/Pictures";
		File dir = new File(path);
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (File f : files) {
				if (f.isFile() && !f.isHidden())
					System.out.println(f.getName());
			}
		}

	}

}
