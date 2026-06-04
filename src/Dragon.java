import java.util.Random ;
import java.util.Scanner;

class Dragon {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        Random rand = new Random() ;
        
     Entity[] being = Entity.entityFactory();
        Diologs.launchStory(input, being[0]) ;
        BattleLauncher.launchBattle(rand, input, being[0], being[1]);
        
        }
}