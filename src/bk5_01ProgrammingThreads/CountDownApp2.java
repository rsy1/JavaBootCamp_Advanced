package bk5_01ProgrammingThreads;

import java.util.ArrayList;
import java.util.List;

//version 2.0 of the Countdown application
public class CountDownApp2 {
	public static void main(String[] args) {
		CountDownClock2 clock = new CountDownClock2(20);
		ArrayList<Runnable> events = new ArrayList<Runnable>();
		
		List<?> list = new ArrayList<Integer>();
		
		events.add(new LaunchEvent2(16, "Flood the pad!", clock));
		events.add(new LaunchEvent2(6, "Start engines!", clock));
		events.add(new LaunchEvent2(0, "Liftoff!", clock));
		clock.start();
		for (Runnable e : events)
			new Thread(e).start();
	}
}

interface TimeMonitor {
	int getTime();
}

class CountDownClock2 extends Thread implements TimeMonitor {
	private int t;

	public CountDownClock2(int start) {
		this.t = start;
	}

	public void run() {
		for (; t >= 0; t--) {
			System.out.println("T minus " + t);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public int getTime() {
		return t;
	}
}

class LaunchEvent2 implements Runnable {
	private int start;
	private String message;
	TimeMonitor tm;

	public LaunchEvent2(int start, String message, TimeMonitor monitor) {
		this.start = start;
		this.message = message;
		this.tm = monitor;
	}

	public void run() {
		boolean eventDone = false;
		while (!eventDone) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			if (tm.getTime() <= start) {
				System.out.println(this.message);
				eventDone = true;
			}
		}
	}
}
