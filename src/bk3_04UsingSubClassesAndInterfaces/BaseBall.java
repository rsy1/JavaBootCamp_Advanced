package bk3_04UsingSubClassesAndInterfaces;

public class BaseBall extends Ball {

	public BaseBall() {
		super();
		setWeight(5.125);
		System.out.println("Hello from the BaseBall constructor");
	}

	public static void main(String[] args) {
		BaseBall bb = new BaseBall();
		bb.hit();
	}

	public void hit() {
		System.out.println("You tore the cover off!");
		super.hit();
	}
}
