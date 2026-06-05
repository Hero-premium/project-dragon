import java.util.Random;
import java.util.Scanner ;

class Player extends Entity {
	Player() {
	super(20,20,"Hero", false, false) ; }
	
	static int applyDamage(int damage, Entity enemy) {
		 if (enemy.isDefending) {
			   damage /= 2 ;
			   enemy.hp -= damage ;
			   enemy.isDefending = false ;
			   System.out.println(enemy.name +  " used a shield to defend himself");
			  
		   } else {
		   enemy.hp -= damage ; 
		   
		   }
		 return enemy.hp; }
	
	@Override
	void taketurn(Entity enemy, Random rand, Scanner input) {
		  String[] attacks = {"kick", "swordSlash", "dash"};

		 
	        int choice = 0 ;
	        int y = 0;
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
	           
	        	   if (!canDodgeAtt) {
	        		  
	        		   switch (choice) {
	        		   case 1 :
	        			   
	                System.out.println(name + " used " + attacks[0]);
	                 y = rand.nextInt(2) + 3;
	                 enemy.hp = applyDamage(y,enemy);
	                break battle ;
	            

	        		   case 2:
	            	System.out.println(name + " used " + attacks[1]);
	               
	                if (75 >= rand.nextInt(100)) {
	                    y = 8;
	                    System.out.println("critical hit!");
	                    enemy.hp = applyDamage(y,enemy);
	                    break battle;
	                } else {
	                    y = rand.nextInt(2) + 3;
	                    enemy.hp = applyDamage(y,enemy);
	                    break battle;
	                }
	           

	        	   case 3: 
	            	System.out.println(name + " used " + attacks[2]);
	                enemy.canDodgeAtt = rand.nextBoolean();
	                y += 1;
	                enemy.hp = applyDamage(y,enemy);
	                break battle;
	        

	        	   case 4 : 
	        		   y += 100;
	        		   enemy.hp = applyDamage(y,enemy);
	                break battle;
	            

	            default :
	            	System.out.println("you had 1, 2 and 3! use those and try again");
	             }
	        		  
	        	   }  
	        	   
	        else {
	        	System.out.println(enemy.name + " has dodged your attack!"); 
	        			canDodgeAtt = false ;
	        			break battle;
	        }
	       
	 }
	 }
}