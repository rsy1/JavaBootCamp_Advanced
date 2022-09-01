package bk2_07Methods;

//Illustration: Understanding pass-by-value

public class ChangeParameters {
	public static void main(String[] args) {
		int number = 1;
		tryToChangeNumber(number);
		System.out.println(number);
	}

	//tryToChangeNumber gets only a copy of number, not the number variable itself,
	public static void tryToChangeNumber(int i) {
		i = 2;
	}
}
