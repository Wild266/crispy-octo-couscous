import java.util.Scanner;
//import java.util.concurrent.atomic.AtomicBoolean;
public class Askings extends Clear{
	public static boolean h (String q, String Yans, String Nans, Scanner s,boolean t, int i) {
		System.out.println("\n\nSituation #" + i);
		System.out.println(q);
		String h=s.next();
		if (h.toLowerCase().equals("y")||h.toLowerCase().equals("yes")) {
			System.out.println(Yans);
			//clearScreen();
			return true;
		} else {
			System.out.println(Nans);
			//clearScreen();
			return false;
		}
	}
}
