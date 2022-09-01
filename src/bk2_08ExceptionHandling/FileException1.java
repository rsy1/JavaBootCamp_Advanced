package bk2_08ExceptionHandling;

import java.io.FileInputStream;

//Illustration: must handle all checked exception using try/catch block

public class FileException1 {
	
	public static void main(String[] args)
	{
	openFile("C:\test.txt");
	}
	public static void openFile(String name)
	{
	FileInputStream f = new FileInputStream(name);
	}

}
