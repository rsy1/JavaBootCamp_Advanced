package bk8_01WorkingwithFiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNio_2 {

	public static void main(String[] args) {
		double x = 39.21f;
		float y = 2.67f;

		String path = "/";
		Path p = Paths.get(path);
		if (!p.exists())
			System.out.println("The input file does not exist!");
	}

	Path p = Paths.get("c:\\test.txt");
	try
	{
		p.createFile();
		System.out.println("File created!");
	}catch(
	Exception e)
	{
		System.out.println("Error: " + e.getMessage());
	}

}
