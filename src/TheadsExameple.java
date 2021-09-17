// We import java.lang so we can have access the interfaces Theads and runnable 
import java.lang.*; 
public class TheadsExameple {
	
	public static void main() {
		
	}
	
	private static Runnable firstThead = new Runnable() {
		
		public void run() {
			for (int i = 10; i<10; i++) {
				
				System.out.println("This print come from  the firstThead" + 1 );
			}
			
		}
	};
	
	public static Runnable SecondThead = new Runnable() {
		
		public void run() {
for (int i = 10; i<10; i++) {
				
				System.out.println("This print come from  the SecondtThead" + 1 );
			}
		}
	};
	
}