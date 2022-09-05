package bk3_07InnerAnonymousClass_Lambda;

//Illustration: Anonymous Class
import java.awt.event.*;
import javax.swing.*;

public class TickTockAnonymous {
	private String tickMessage = "Tick...";
	private String tockMessage = "Tock...";

	public static void main(String[] args) {
		TickTockAnonymous t = new TickTockAnonymous();
		t.go();
	}

	private void go() {
		// create a timer that calls the Ticker class
		// at one second intervals
		Timer t = new Timer(1000, new ActionListener()  //new ActionListener() is the creation of the anonymous class.
			{
			private boolean tick = true;

			public void actionPerformed(ActionEvent event) {
				if (tick) {
					System.out.println(tickMessage);
				} else {
					System.out.println(tockMessage);
				}
				tick = !tick;
			}
		});
		t.start();
		// display a message box to prevent the
		// program from ending immediately
		JOptionPane.showMessageDialog(null, "Click OK to exit program");
		System.exit(0);
	}
}

/*
 * Line 11 :: Anonymous classes won’t work in a static context, so the main method creates an instance of the TickTockAnonymous class and executes the go method,
 * 			  to go out of the static context/method 
 * Line 19 :: In the go method, an instance of the Timer class is created. 
 * Line 19 :: The second parameter of the TimerClass constructor is an object that implements the ActionListener interface. This object is created here via an
 * 			  anonymous class. ActionListener is specified as the type for this class. 
 * Line 20 :: This left brace marks the beginning of the body of the anonymous class. 
 * Line 24 :: The actionPerformed method is called every 1,000 milliseconds by the timer. Note that this method can freely access fields defined in the outer class.
 * Line 31 :: The right brace on this line marks the end of the body of the anonymous class. Then the right parenthesis marks the end of the parameter list for the Timer
 *            constructor. The left parenthesis that’s paired with this right parenthesis is on line 19. Finally, the semicolon marks the end of the assignment statement 
 *            that started on line 19. * 
 */
