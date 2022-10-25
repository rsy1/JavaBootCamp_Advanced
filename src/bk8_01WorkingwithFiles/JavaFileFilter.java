package bk8_01WorkingwithFiles;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class JavaFileFilter extends FileFilter {

	@Override
	public boolean accept(File f) {
		if (f.isDirectory())
			return true;
		String name = f.getName();
		if (name.matches(".*\\.java"))
			return true;
		else
			return false;
	}

	@Override
	public String getDescription() {
		return "Java files (*.java)";
	}

}
