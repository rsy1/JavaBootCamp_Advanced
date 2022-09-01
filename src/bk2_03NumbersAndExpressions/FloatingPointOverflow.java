package bk2_03NumbersAndExpressions;

//Java’s floating-point math is close enough not to matter. The margin of error is extremely small.

import java.text.NumberFormat;

public class FloatingPointOverflow {
	public static void main(String[] args) {
		float x = 0.1f;
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMinimumFractionDigits(10);
		System.out.println(nf.format(x));
	}

}
