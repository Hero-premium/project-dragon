import java.util.Random;
import java.util.Scanner;

public class BattleLauncher {
	 static void attCall(Entity being) {
	        being.hp = Math.max(being.hp, 0);
	        System.out.println(being.name + " now has " + being.hp + "hp");
	    }
	 
	@SuppressWarnings("unused")
	static void launchBattle(Random rand, Scanner input, Entity Player, Entity enemy) {
	  System.out.println("_______ battle starts! _______");
      System.out.println(Player.name + " has " + Player.hp + " hit points");
      System.out.println(enemy.name + " has " + enemy.hp + " hit points");
 battleloop:
      while (true) {

    	  Player.taketurn(enemy,rand,input) ;
      	attCall(enemy); 
      	
      	if (enemy.hp <= 0) { 
      		System.out.println("You won!");
      		System.out.println("to keep going press any button");
      		input.nextLine();
      		break ;}
      	
      	enemy.taketurn(Player,rand,input) ;
      	attCall(Player); 
      	
        if (Player.hp <= 0) {
System.out.println("you lost!")  ;
System.out.println("to retry press 1 to quit press 2") ;

int choice ;
choiceloop:
while (true) {
retryloop:
while (true) {
try {
choice = input.nextInt();
input.nextLine(); 
break retryloop;
} catch (Exception e) {
   System.out.println("you had 1 and 2! use those and try again") ;
   input.nextLine(); 
}
}

switch (choice) {
case 1:
	enemy.hp = enemy.maxhp ;
	Player.hp = Player.maxhp ;
	break choiceloop ;
	
case 2:
	System.exit(0) ;
	default :
		System.out.println("you had 1 and 2! use those and try again") ;
	}
          }
        }  
      }
      
}
}
