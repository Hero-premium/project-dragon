import java.util.Random;
import java.util.Scanner;

class PlayerCombatSystem {
	 @SuppressWarnings("unused")
	static void PlayerTurn(Random rand, Scanner input, Entity defender, Entity player) {
	        String[] attacks = {"kick", "swordSlash", "dash"};

	      
	        int choice = 0 ;
	     battle:
	        while (true) {
	        	
	        	while (true) {
	        		System.out.println("for kick press [1] for swordSlash press [2] for dash press [3]");
	           try {
	            choice = input.nextInt();
	            input.nextLine(); 
	            break ;
	           } catch (Exception e) {
	        	   System.out.println("game:use numbers!") ;
	               input.nextLine(); 
	           }
	           }
	           
	        	   if (!player.canDodgeAtt) {
	        		   
	        		   switch (choice) {
	        		   case 1 :
	                System.out.println(player.name + " used " + attacks[0]);
	                int y = rand.nextInt(2) + 3;
	                defender.hp -= y;
	                break battle ;
	            

	        		   case 2:
	            	System.out.println(player.name + " used " + attacks[1]);
	                int x = rand.nextInt(100);

	                if (x >= 70) {
	                    int damage = 8;
	                    System.out.println("critical hit!");
	                    defender.hp -= damage;
	                    break battle;
	                } else {
	                    x = rand.nextInt(2) + 4;
	                    defender.hp -= x;
	                    break battle;
	                }
	           

	        	   case 3: 
	            	System.out.println(player.name + " used " + attacks[2]);
	                defender.canDodgeAtt = rand.nextBoolean();
	                defender.hp -= 1;
	                break battle;
	        

	        	   case 4 : 
	                defender.hp -= 100;
	                break battle;
	            

	            default :
	            	System.out.println("you had 1, 2 and 3! use those and try again");
	             }
	        	   }  
	        	   
	        else {
	        	System.out.println(defender.name + " has dodged your attack!"); 
	        			player.canDodgeAtt = false ;
	        			break battle;
	        }
	       
	 }
	 }
}