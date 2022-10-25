package bk8_01WorkingwithFiles;

//Illustration : lists the name of every file in a directory whose pathname is stored in the String variable path

import java.io.File;
import java.io.IOException;

public class FileDirectorySystem {

	public static void main(String[] args) {
		String path = "/";
		File dir = new File(path);
		if (dir.isDirectory())
		{
		File[] files = dir.listFiles();
		for (File f : files)
			try {
				System.out.println(f.getName() + " Total Space >> " + f.getTotalSpace() + " " + f.getCanonicalPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
