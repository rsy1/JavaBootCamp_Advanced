package bk3_04UsingSubClassesAndInterfaces;

public class ProductDataException extends Exception {
	private static final long serialVersionUID = 8063365040272927135L;

	public ProductDataException() {
	}

	public ProductDataException(String message) {
		super(message);
	}
}