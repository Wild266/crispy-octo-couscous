//The purpose of this was to clear the console for a more user friendly GUI
public class Clear {
	//This method isn't functional unless you are using the command window of your PC
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  //Still wondering what this piece of code means, it was discovered on Stack Overflow
	    System.out.flush();  
	}  
}
