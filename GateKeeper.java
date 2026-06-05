import java.util.Random;

class GateKeeper extends Entity {
	GateKeeper() {
	super(25,25,"GateKeeper", false) ;
	}
	
	@Override
	void taketurn(Entity player, Random rand) {
			 player.hp -= 3 ;
		 }
}