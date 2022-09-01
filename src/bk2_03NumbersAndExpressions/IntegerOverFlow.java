package bk2_03NumbersAndExpressions;

public class IntegerOverFlow {
	public static void main(String[] args) {
		int a = 1000000000;
		System.out.println(a);
		a += 1000000000;
		System.out.println(a);
		a += 1000000000;
		System.out.println(a);
		a += 1000000000;
		System.out.println(a);
	}
}
