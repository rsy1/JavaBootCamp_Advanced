package bk2_08ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Illustration: Catching FileNotFoundException using try/catch block
//You are forced to handle "Checked exception" always

public class FileException2 {
	public static void main(String[] args) {
		openFile("C:\test.txt");
	}

	public static void openFile(String name) {
		try {
			FileInputStream f = new FileInputStream(name);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found.");
		}
	}

	public static void openFile(String name, String name2) throws FileNotFoundException {
		FileInputStream f = new FileInputStream(name);
	}
}
