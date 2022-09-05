package bk3_07InnerAnonymousClass_Lambda;

public class Anonymous {
	public static void main(String[] args) {
		Ball b = new Ball() {
			public void hit() {
				System.out.println("You hit it!");
			}
		};
		b.hit();
	}

	interface Ball {
		void hit();
	}
}
