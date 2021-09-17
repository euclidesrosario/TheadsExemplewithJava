
// We import java.lang so we can have access the interfaces Theads and runnable 
import java.lang.*;

public class TheadsExameple {

	/**
	 * Inside the method main I'm instanced and started two threads, these threads
	 * run the methods firstthred and secondthead at the same time ie asyncrhonusly
	 */
	public static void main() {

		new Thread(firstThread).start();
		new Thread(SecondThread).start();

	}

	private static Runnable firstThread = new Runnable() {

		public void run() {
			for (int i = 10; i < 10; i++) {

				System.out.println("This print come from  the firstThead" + 1);
			}

		}
	};

	public static Runnable SecondThread = new Runnable() {

		public void run() {
			for (int i = 10; i < 10; i++) {

				System.out.println("This print come from  the SecondtThead" + 1);
			}
		}
	};

}