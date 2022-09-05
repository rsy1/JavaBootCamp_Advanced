package bk3_03WorkingWithStatics;

public class Invoice {
	private static double taxRate = 0.75;
	private double salesTotal;

	public double getTax() {
		return salesTotal * taxRate;
	}
}
