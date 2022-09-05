package bk3_04UsingSubClassesAndInterfaces;

public class Product {
	private String productCode;
	private String productDescptrion;
	private double productSellPrice;
	private double productCostPrice;
	private double productProfit;
	
	public Product() {		
	}
	public Product(String productCode, String productDescptrion, double productSellPrice, double productCostPrice, double productProfit) {
		super();
		this.productCode = productCode;
		this.productDescptrion = productDescptrion;
		this.productSellPrice = productSellPrice;
		this.productCostPrice = productCostPrice;
		this.productProfit = productProfit;
	}		
	
	public String getProductCode() {
		return productCode;
	}
	public String getProductDescptrion() {
		return productDescptrion;
	}
	public double getProductSellPrice() {
		return productSellPrice;
	}
	public double getProductCostPrice() {
		return productCostPrice;
	}
	public double getProductProfit() {
		return productProfit;
	}
	
}
