import java.util.Scanner;
//import java.util.concurrent.atomic.AtomicBoolean;
public class Main extends Askings{
	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		System.out.println("Welcome to the Game of Choices!");
		boolean p=true;
		//AtomicBoolean ab = new AtomicBoolean();
		int i=1;
		
		System.out.println("Enter your name:\n");
		String userName = s.next();
		System.out.println("Hello "+userName+", are you ready to play?");
		if(s.next().toLowerCase().equals("yes")) {
			System.out.println("\n\n\nLet the Journey Begin!\n\n\n ");
		} else {
			System.out.println("Ok, goodbye "+userName+".");
			System.exit(0);
		}

		if (		!h("You find yourself on a boat, should you look around?",
				"You look around and barely avoid being bitten by a snake",
				"A snake comes out and bites you",s,p,i)) {
			System.out.println("\n\nYOU DIED!");
			System.exit(0);
			
		}

		if (		h("The snake is lying on the floor limped. Should you throw its body in the freezing sea?",
				"The snake seems to jolt back to life and jumps back on the boat, and starts biting your toe!",
				"Magic unfolds before your eyes as the snake grows wings and lengthens its fangs. It is now a dragon!",s,p,i)) {
			System.out.println("\n\nYOU DIED!");
			System.exit(0);
		}
		
		if (h("The Magic before your eyes gives way to the fear in your head. Should you attack it?",
				"You remember its previous attempt to bite you and attack it with full force in rage but then you realize its a dragon. \nUnfortunately, it's too late and though the dragon doesn't seem to spew out fire from its mouth you can't \ntell what it is until it's too late.",
				"You hide in what seems to be the cabin of the boat in a position in which you can see the dragon through the windshield",s,p,i)) {
			System.out.println("\n\nYOU DIED!");
			System.exit(0);
			
		}
		
		if (h("Do you want to examine the dragon by looking through the windshield?",
				"You look through to see it looking straight back into your eyes. Your vision seems to blur but before everything goes black, \nyou feel a blow on the back of your head as it hits the floor.",
				"You hide in what seems to be the cabin of the boat in a position in which you can see the dragon through the windshield",s,p,i)) {
			System.out.println("\n\nYOU DIED!");
			System.exit(0);
		}
		
		if (!h("You are now trapped on a boat...with a dragon! You think you see a ship in the distance through the other window. You \nalso find a flare gun, should you fire it?",
				"You shoot the gun out the window in which you saw the ship-a daring move...Confusingly, the ship seems to notice your \ncall and shoots a flare in the sky too. You're still hidden from the dragon but aren't sure what you should do now.",
				"Before you can think of another way to signal the ship the dragon enters the cabin unnoticed, or at least until it traps you in its mouth!",s,p,i)) {
			System.out.println("\n\nYOU DIED!");
			System.exit(0);
		}
		if (!h("You are afraid that the dragon might have noticed the flare from the boat. You also find the driver's seat with the key in its slot and a lever \nthat says 'throttle' on it. Should you push it and try to steer to the other ship?",
				"You turn the key. You find the boat has a full tank",
				"As you turn away from the driver's seat, the floor, which was wet to begin with, seems to be getting wetter by the millisecond\nbefore you know it, water floods into the cabin which you're currently trapped in. You open a door \nto try to get out, but more water pressure floods through pushing you back in, trapped.",s,p,i)) {
			System.out.println("\n\nYOU DIED!");
			System.exit(0);
		}
		if (!h("You decide to start driving to the ship. Should you drive fast?",
				"You push the throttle lever up as far as it goes.",
				"The boat crawls so slowly you can't tell if it's the waves moving the boat or the engine. The dragon seems to get curious about the \ncabin before meeting you inside. Before you know it smokes rising from your clothes!",s,p,i)) {
			System.out.println("\n\nYOU DIED!");
			System.exit(0);
		}
		System.out.println("\n\nCongratulations! You Win!");
		System.exit(0);
		

	}
}
