import java.util.Random;

class GateKeeperCombatSystem {
	 static void GateKeeperTurn(Random rand, Entity Player, Entity GateKeeper) {
	        String[] attacks = {"kick", "swordSlash", "dash"};
	        
	        	   if (!GateKeeper.canDodgeAtt) {
	       	 //    int choice = rand.nextInt(3);
	      int choice = 3 ;
	        		   switch (choice) {
	        		   case 0 :
	                System.out.println(GateKeeper.name + " used " + attacks[0]);
	                int y = rand.nextInt(2)+ 4;
	                Player.hp -= y;
	             break ;
	            
	        		   case 1:
	            	System.out.println(GateKeeper.name + " used " + attacks[1]);
	                int x = rand.nextInt(100);

	                if (x >= 80) {
	                    int damage = 8;
	                    System.out.println("critical hit!");
	                    Player.hp -= damage;
	                    break ;
	                } else {
	                    x = rand.nextInt(2) + 4;
	                    Player.hp -= x;
	                    break;
	                }
	           

	        	   case 2: 
	            	System.out.println(GateKeeper.name + " used " + attacks[2]);
	            	Player.canDodgeAtt = rand.nextBoolean();
	            	Player.hp -= 1;
	                break ;
	        	   case 3:
	        		   
	        		   Player.hp = 0;
	            break ;

	            default :
	            	System.out.println("you had 1, 2 and 3! use those and try again");
	             }
	        	   }  
	        	   
	        else {
	        	System.out.println(Player.name + " has dodged your attack!"); 
	        	GateKeeper.canDodgeAtt = false ;
	      
	        }
	       
	 }
	 }