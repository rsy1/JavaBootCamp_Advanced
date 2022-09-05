package bk3_02MakingOwnClasses;

//Illustration: Recursive
//

public class CrazyClass {
	private String firstString;
	private String secondString;

	public CrazyClass(String first, String second) {
		this(first);
		secondString = second;
	}

	public CrazyClass(String first) {
		this(first, "DEFAULT"); // error: won't
		// compile
	}
}
