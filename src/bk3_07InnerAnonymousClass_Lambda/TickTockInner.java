package bk3_07InnerAnonymousClass_Lambda;

//Illustration: Using inner classes
import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.JOptionPane;

public class TickTockInner {
	private String tickMessage = "Tick...";
	private String tockMessage = "Tock...";

	public static void main(String[] args) {
		TickTockInner t = new TickTockInner();
		t.go();
	}
	
	/*
	 * The technique used in lines 11 and 13 is a fairly common programming
	 * technique that lets an application get out of a static context quickly and
	 * into an object-oriented mode.
	 */

	private void go() {
		// create a timer that calls the Ticker class
		// at one second intervals
		Timer t = new Timer(1000, new Ticker());
		t.start();
		// display a message box to prevent the
		// program from ending immediately
		JOptionPane.showMessageDialog(null, "Click OK to exit program");
		System.exit(0);
	}

	//The actionPerformed method is called by the Timer object every 1,000 milliseconds.
	class Ticker implements ActionListener {
		private boolean tick = true;

		public void actionPerformed(ActionEvent event) {
			if (tick) {
				System.out.println(tickMessage); //the inner class Ticker is able to access outer class variable directly
			} else {
				System.out.println(tockMessage); ////the inner class Ticker is able to access outer class variable directly
			}
			tick = !tick;
		}
	}
}