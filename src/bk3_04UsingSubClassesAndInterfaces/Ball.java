package bk3_04UsingSubClassesAndInterfaces;

public class Ball {
	
	private double weight;	
	private int velocity;
	
	public Ball() {
		System.out.println("Hello from the Ball constructor");
	}
	public Ball(double weight, int velocity) {
		this.weight = weight;
		this.velocity = velocity;
	}
	
	public int getVelocity() {
		return velocity;
	}
	protected double getWeight() {
		return this.weight;
	}

	protected void setWeight(double weight) {
		this.weight = weight;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public void hit() {
		System.out.println("You hit it a mile!");
	}
}
