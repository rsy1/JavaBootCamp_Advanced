package bk5_01ProgrammingThreads;

class MyThread extends Thread {
	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
// ignore the InterruptedException - this is perhaps the one of the
// very few of the exceptions in Java which is acceptable to ignore
		}
		System.out.println("In run(); thread name is: " + getName());
	}

	public static void main(String args[]) {
		Thread myThread = new MyThread();
		myThread.start();
		System.out.println("In main(); thread name: " + Thread.currentThread().getName());
	}
}