import java.util.Scanner;

class Diologs {
	static int Continue(Scanner input, int move) {
        while (true) {
        try {
        move = input.nextInt();
        input.nextLine();
        break;
        } catch (@SuppressWarnings("unused") Exception e) {
            System.out.println("use numbers!") ;
            input.nextLine() ;
        }
        }
        return move;
}
	
	static void print(String text) {
        System.out.println(text);
	}
	static void launchStory(Scanner input, Entity pl) {
		int move = 0;
		
	   print("Gatekeeper: welcome to this dungeon; but coming here was a big mistake! as there's an angry dragon ready to hunt whoever enters.");
       print("to continue press any number");
       move = Continue(input, move) ;
       if (move != 67) { // this is for me to test things
           print("player: yes! I know, but I want the gold the dragon is hiding beneath his thrown.");
           print("Gatekeeper: what do I call you, hunter?");
           print("game:put your gamer tag here") ;
           pl.name = input.nextLine();

           print("Gatekeeper: but " + pl.name + ", that is such a dangerous mission, how are you planning on doing it?");
           Continue(input, move);

           print(pl.name + ": of course I didn't come unprepared, I do have some moves that will help me defeat this evil monster");

         Continue(input,move);
           print("Gatekeeper: and what are they...?");
         Continue(input, move);

           print(pl.name + ": dash! an awesome ability that would help me dodge the dragon attacks, sometimes I don't move fast enough though");
           print("swordSlash: im not very good at using my sword, but the sword helps me attack vital organs, but most of the time i can't");
           print("kick: one of my best moves that I mastered, it's still based on my human abilities but it's very consistent");

           Continue(input, move);
           print("Gatekeeper: oh you shouldn't have told me that, as I'll be your first foe, I'll defend my lord with my life!");
       }

	}
	static void Story2(Scanner input, Entity pl) {
		int move = 0;
	System.out.println(pl.name + ": yoooo this is working... keep on the good codes :D ");
	Continue(input,move) ;
}
}