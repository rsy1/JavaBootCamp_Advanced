package bk5_01ProgrammingThreads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class CountDownAppNew {
	public static void main(String[] args) {
		ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(25);

		Runnable flood, ignition, liftoff;
		flood = new LaunchEventNew("Flood the pad!");
		ignition = new LaunchEventNew("Start engines!");
		liftoff = new LaunchEventNew("Liftoff!");
		
		System.out.println("Avialable Processors >> : " + Runtime.getRuntime().availableProcessors());
			
		for (int t = 20; t >= 0; t--) {
			pool.schedule(new CountDownClockNew(t), (long) (20 - t), TimeUnit.SECONDS);
		}

		//How is the delay executed in the ScheduledThreadPoolExecutor????
		pool.schedule(flood, 3L, TimeUnit.SECONDS);
		pool.schedule(ignition, 13L, TimeUnit.SECONDS);
		pool.schedule(liftoff, 19L, TimeUnit.SECONDS);
		pool.shutdown();
	}
}

/*
 * pool.schedule(new CountDownClockNew(16),(long) (20 - 16), TimeUnit.SECONDS);
 * 
 * In the pool.schedule method call, the number (long) (20 - 16) tells Java to
 * wait 4 seconds before running the T minus 16 thread. Each of the T minus
 * threads has a different delay, so each thread runs at the appropriate time.
 * The same is true of the flood, ignition, and liftoff events.
 */