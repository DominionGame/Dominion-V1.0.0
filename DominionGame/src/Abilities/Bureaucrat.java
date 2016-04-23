package Abilities;

import card.Card;
import javaClasses.Player;

public class Bureaucrat extends Ability implements IAbility{
	
	
	public Bureaucrat() {
		this.amount=amount;

	}

	@Override
	public void playAbility(Player target) {
	//eens denken waar onze silver cardpile zal zitten, apart of alles in één array "supplyPiles".	
	 target.drawPile.drawCard(target.getGame().supplyPiles.get(4));
	 for(Player player: target.getGame().players)
		{
			//Voor elke speler behalve deze die de ability speelt.
			if(player.getName() != target.getName())
			{
				boolean Victoryfound = false;
				for (Card c : player.hand) {
					if(c.getType() =="Victory"){
						Victoryfound= true;
					}
				}
				if(Victoryfound == false){
					for (Card c : player.hand) {
							player.revealCard(c);
						
					}
				}
				else{
					int i =0;
					while(player.hand.get(i).getType() != "Victory"){
						i++;
					}
					player.revealCard(player.hand.get(i));
					player.drawPile.add(player.hand.get(i));
					player.hand.remove(i);
				}
			}
		}
	}
}
