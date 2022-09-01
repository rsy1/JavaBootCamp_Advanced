package bk2_05UsingLoops;

public class NestedLoop {

	public NestedLoop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		for (int x = 1; x < 10; x++) {
			for (int y = 1; y < 10; y++)
				System.out.print(x + "-" + y + " ");
			System.out.println();
		}
	}

}

/*For each execution of the outer loop, the inner
loop executes 10 times and prints a line that shows the value of x and y for each
pass through the inner loop. When the inner loop finishes, a call to System.out.
println with no parameters forces a line break, thus starting a new line.*/