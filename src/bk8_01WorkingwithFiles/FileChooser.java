package bk8_01WorkingwithFiles;

import java.io.File;

import javax.swing.JFileChooser;

public class FileChooser {

	public static void main(String[] args) {
		
		JFileChooser fc = new JFileChooser();
		fc.setDialogTitle("Tasangana Mu Java");
		//fc.setFileHidingEnabled(false);
		fc.setFileSelectionMode(fc.FILES_ONLY);;
		fc.setMultiSelectionEnabled(true);
		fc.setAcceptAllFileFilterUsed(false);
		fc.addChoosableFileFilter(new JavaFileFilter());
		int result = fc.showOpenDialog(null);
		 //Investigate why the dialog does not choose file first time, only choose @ second time
		
		//You can use this returned File object elsewhere in the program to read or write data.
		 File file = FileChooser.getFile();
		 
		 //For now, just printing the file obj to the console.
		 System.out.println(file.toString());
	}

	private static File getFile() {
		JFileChooser fc = new JFileChooser();
		int result = fc.showOpenDialog(null);
		File file = null;
		if (result == JFileChooser.APPROVE_OPTION)
			file = fc.getSelectedFile();
		return file;
	}
}
