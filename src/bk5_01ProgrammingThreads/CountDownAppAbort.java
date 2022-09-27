package bk5_01ProgrammingThreads;

import java.util.ArrayList;

public class CountDownAppAbort {
	public static void main(String[] args) {
		CountDownClockAbort clock = new CountDownClockAbort(20);
		ArrayList<Runnable> events = new ArrayList<Runnable>();
		events.add(new LaunchEventAbort(16, "Flood the pad!", clock));
		events.add(new LaunchEventAbort(6, "Start engines!", clock));
		events.add(new LaunchEventAbort(0, "Liftoff!", clock));
		clock.start();
		for (Runnable e : events)
			new Thread(e).start();
	}
}

interface TimeMonitorAbort {
	int getTime();

	void abortCountDown();
}

class CountDownClockAbort extends Thread implements TimeMonitorAbort {
	private int t;

	public CountDownClockAbort(int start) {
		this.t = start;
	}

	public void run() {
		boolean aborted = false;
		for (; t >= 0; t--) {
			System.out.println("T minus " + t);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				aborted = true;
			}
			if (Thread.interrupted())
				aborted = true;
			if (aborted) {
				System.out.println("Stopping the clock!");
				break;
			}
		}
	}

	public int getTime() {
		return t;
	}

	public synchronized void abortCountDown() {
		Thread[] threads = new Thread[Thread.activeCount()];
		Thread.enumerate(threads);
		for (Thread t : threads)
			t.interrupt();
	}
}

class LaunchEventAbort implements Runnable {
	private int start;
	private String message;
	TimeMonitorAbort tm;

	public LaunchEventAbort(int start, String message, TimeMonitorAbort monitor) {
		this.start = start;
		this.message = message;
		this.tm = monitor;
	}

	public void run() {
		boolean eventDone = false;
		boolean aborted = false;
		while (!eventDone) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				aborted = true;
			}
			if (tm.getTime() <= start) {
				System.out.println(this.message);
				eventDone = true;
				System.out.println("ABORT!!!!");
				tm.abortCountDown();
			}
			if (Thread.interrupted())
				aborted = true;
			if (aborted) {
				System.out.println("Aborting " + message);
				break;
			}
		}
	}
}
