package bk3_05AbstractClassesAndInterfaces;

public class BallFactoryInstance {
	public static Ball getBall(String s) {
		if (s.equalsIgnoreCase("BaseBall"))
			return new BaseBall();
		if (s.equalsIgnoreCase("SoftBall"))
			return new SoftBall();
		return null;
	}
}
