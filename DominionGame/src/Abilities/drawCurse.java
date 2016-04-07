package Abilities;
import javaClasses.*;
import javaClasses.Player;

public class drawCurse extends Ability implements IAbility{
	int amount;
	
	public drawCurse(int amount) {
		
		this.amount = amount;
	}

	@Override
	public void playAbility(Player target) {
		
		for(Player player: target.getGame().players){
			if(!player.getName().equals(target.getName()))
			{
				for(int i=0;i<amount;i++)
				{
					player.discardPile.drawCard(target.getGame().cursePile);
					System.out.println("Player " + player.getName() + " drew a Curse Card");
				}
			}
		}
	}

}
