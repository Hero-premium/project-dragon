import java.util.Random;
import java.util.Scanner ;

class Player extends Entity {
	Player() {
	super(20,20,"Hero", false) ;
	}
	
	@Override
	void taketurn(Entity enemy, Entity Player, Random rand, Scanner input) {
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
	           } catch (@SuppressWarnings("unused") Exception e) {
	        	   System.out.println("game:use numbers!") ;
	               input.nextLine(); 
	           }
	           }
	           
	        	   if (!Player.canDodgeAtt) {
	        		   
	        		   switch (choice) {
	        		   case 1 :
	                System.out.println(Player.name + " used " + attacks[0]);
	                int y = rand.nextInt(2) + 3;
	                enemy.hp -= y;
	                break battle ;
	            

	        		   case 2:
	            	System.out.println(Player.name + " used " + attacks[1]);
	                int x = rand.nextInt(100);

	                if (x >= 70) {
	                    int damage = 8;
	                    System.out.println("critical hit!");
	                    enemy.hp -= damage;
	                    break battle;
	                } else {
	                    x = rand.nextInt(2) + 4;
	                    enemy.hp -= x;
	                    break battle;
	                }
	           

	        	   case 3: 
	            	System.out.println(Player.name + " used " + attacks[2]);
	                enemy.canDodgeAtt = rand.nextBoolean();
	                enemy.hp -= 1;
	                break battle;
	        

	        	   case 4 : 
	                enemy.hp -= 100;
	                break battle;
	            

	            default :
	            	System.out.println("you had 1, 2 and 3! use those and try again");
	             }
	        	   }  
	        	   
	        else {
	        	System.out.println(enemy.name + " has dodged your attack!"); 
	        			Player.canDodgeAtt = false ;
	        			break battle;
	        }
	       
	 }
	 }
}