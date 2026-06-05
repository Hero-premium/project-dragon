import java.util.Random;
import java.util.Scanner ;

class GateKeeper extends Entity {
	GateKeeper() {
	super(25,25,"GateKeeper", false, false) ;
	}
	
	@Override
	void taketurn(Entity Player, Random rand, Scanner input) {
		        String[] attacks = {"kick", "", "Sheild"};
		        
		        	   if (!canDodgeAtt) {
		       	  int choice = rand.nextInt(3);
                  int damage  = 0;
		        		   switch (choice) {
		        		   case 0 :
		                System.out.println(name + " used " + attacks[0]);
		                int y = rand.nextInt(2)+ 4;
		               damage += y;
		             break ;
		            
		        		   case 1:
		            	System.out.println(name + " used " + attacks[1]);
		                 int x = rand.nextInt(100);

		                if (x >= 80) {
		                    y = 8;
		                    System.out.println("critical hit!");
		                    damage += y;
		                    break ;
		                } else {
		                    y = rand.nextInt(2) + 4;
		                    damage += y;
		                    break;
		                }
		           

		        	   case 2: 
		            	System.out.println(name + " used " + attacks[2]);
		            	isDefending = true;
		            	damage += 2;
		                break;

		            default :
		            	System.out.println("you had 1, 2 and 3! use those and try again");
		        		   }
		        		   
		        	   Player.hp -= damage ;
		        	   
		        	   }
		        else {
		        	System.out.println(Player.name + " has dodged your attack!"); 
		        	canDodgeAtt = false ;
		      
		        }
		       
		 }
		 }