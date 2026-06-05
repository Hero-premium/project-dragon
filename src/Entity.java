import java.util.Random;
import java.util.Scanner ;

class Entity {

	int hp;
	int maxhp;
	String name ;
	boolean canDodgeAtt;
	boolean isDefending;
	Entity(int hp, int maxhp, String name , boolean canDodgeAtt, boolean isDefending) {  

		this.hp = hp ;
		this.maxhp = maxhp ;
		this.name = name ;
		this.canDodgeAtt =  canDodgeAtt ;
        this.isDefending = isDefending;
	}
	static Entity[] entityFactory()  {

    Entity[] being =  {new Player(), new GateKeeper()} ;

   
     return being;
	}
	
	@SuppressWarnings("unused")
	void taketurn(Entity player, Random rand, Scanner input) {
		
	}
}
