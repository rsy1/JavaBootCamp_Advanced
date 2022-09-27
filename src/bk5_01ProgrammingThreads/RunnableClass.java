package bk5_01ProgrammingThreads;

public class RunnableClass implements Runnable {

	@Override
	public void run() {
		RunnableClass rc = new RunnableClass();
		Thread t = new Thread(rc);
		t.start();	
	}
	
	/*
	 * @Override public void run() { Thread t1 = new Thread(new RunnableClass());
	 * t1.start();
	 * 
	 * }
	 * 
	 * //This single-line version works — provided that you don’t need to access the
	 * thread object later in the program.
	 * 
	 * @Override public void run() { new Thread(new RunnableClass()).start(); }
	 */
}
