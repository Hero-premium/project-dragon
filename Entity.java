import java.util.Random;

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

	String[] name = {"Hero","Gatekeeper"} ;
    int[] hp = {25,30} ;
    Entity[] being = new Entity[name.length] ;

    for (int i = 0 ; i < name.length; i++) {
being[i] = new Entity(hp[i], hp[i], name[i], false) ;
    }
    return being;
	}
	
	void taketurn(Entity player, Random rand) {
		
	}
}