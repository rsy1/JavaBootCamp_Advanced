package bk2_08ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Illustration: Using the throws clause to escape handling the exception in that method.
//The calling method must handle the exception thrown by the called method
//Can throw more than one exception, list them after the "throws" clause and comma seperated.

public class FileException3 {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			openFile("C:\test.txt");
		}		
		catch (IOException | ArithmeticException ex) {
		ex.printStackTrace();
		}
	}

	public static void openFile(String name) throws FileNotFoundException, IOException {
		FileInputStream f = new FileInputStream(name);
	}
}
