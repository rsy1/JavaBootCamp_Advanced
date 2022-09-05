package bk3_06UsingObjectAndClassClasses;

//Illustration: Overiding toString() method
public class OverideToString {
	public static void main(String[] args) {
		Product prod = new Product("TP", "Tooth Paste");
		System.out.println(prod.toString());
	}
}

class Product {
	private String prodID;
	private String productName;

	public Product(String prodID, String prodName) {
		this.prodID = prodID;
		this.productName = prodName;
	}

	/*
	 * public String toString() { return "Product[" + this.prodID + " : " +
	 * this.productName + "]"; }
	 */

	public String toString() {
		return this.getClass().getName() + "[" + this.prodID + " " + this.productName + "]";
	}
}
