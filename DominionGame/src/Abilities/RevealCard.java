package Abilities;

import card.Card;
import javaClasses.Player;

public class RevealCard extends Ability implements IAbility{

private int amount;
private Card targetedCard;

	
	public RevealCard(int amount)
	{
			
			this.amount =amount;
			
	}
	
	public void playAbility(Player target) 
	{
		
		for(int i = 0; i<amount;i++ ){
			
			//target.getCard(targetedCard);
		}
	}
}
