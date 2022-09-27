package bk5_01ProgrammingThreads;

import java.util.ArrayList;

/*public class CountDownApp {
	public static void main(String[] args) {
		Thread clock = new CountDownClock();
		clock.start();
	}
}*/

public class CountDownApp {
	/*
	 * public static void main(String[] args) { Thread clock = new CountDownClock();
	 * //RunnableClass clock = new RunnableClass();
	 * 
	 * Runnable flood, ignition, liftoff;
	 * 
	 * flood = new LaunchEvent(16, "Flood the pad!"); ignition = new LaunchEvent(6,
	 * "Start engines!"); liftoff = new LaunchEvent(0, "Liftoff!");
	 * 
	 * clock.start(); //clock.run();
	 * 
	 * new Thread(flood).start(); new Thread(ignition).start(); new
	 * Thread(liftoff).start();
	 *}*/

	public static void main(String[] args) {
		Thread clock = new CountDownClock(1);
		ArrayList<Runnable> events = new ArrayList<Runnable>();
		events.add(new LaunchEvent(16, "Flood the pad!"));
		events.add(new LaunchEvent(6, "Start engines!"));
		events.add(new LaunchEvent(0, "Liftoff!"));
		clock.start();
		for (Runnable e : events)
			new Thread(e).start();
	}

}