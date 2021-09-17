
// We import java.lang so we can have access the interfaces Theads and runnable 

public class TheadsExameple {

	/**
	 * Inside the method main I'm instanced and started two threads, these threads
	 * run the methods firstthred and secondthead at the same time ie asyncrhonusly
	 */
	public static void main(String [] args) {
		
		new Thread(firstThread).start();
		new Thread(SecondThread).start();
		
		
	}

	private static Runnable firstThread = new Runnable() {
		@Override
		public void run() {
			System.out.println("Hello!!! we're executing threads ");

			for (int i = 0; i < 10; i++) {
				System.out.println("This print come from  the firstThead " + i);

			}

		}
	};

	public static Runnable SecondThread = new Runnable() {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {

				System.out.println("This print come from  the SecondtThead " + i);
			}
		}
	};
	
}