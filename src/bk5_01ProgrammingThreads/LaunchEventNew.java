package bk5_01ProgrammingThreads;

public class LaunchEventNew extends Thread {
	private String message;

	public LaunchEventNew(String message) {
		this.message = message;
	}

	public void run() {
		System.out.println(message);
	}
}
