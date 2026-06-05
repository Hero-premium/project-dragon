import java.util.Random;
import java.util.Scanner ;

class Entity {

	int hp;
	int maxhp;
	String name ;
	boolean canDodgeAtt;
	Entity(int hp, int maxhp, String name , boolean canDodgeAtt) {  

		this.hp = hp ;
		this.maxhp = maxhp ;
		this.name = name ;
		this.canDodgeAtt =  canDodgeAtt ;

	}
	static Entity[] entityFactory()  {

    Entity[] being =  {new Player(), new GateKeeper()} ;

   
    return being;
	}
	
	@SuppressWarnings("unused")
	void taketurn(Entity player, Entity enemy, Random rand, Scanner input) {
		
	}
}