package Abilities;

import card.Card;
import javaClasses.Player;

public class Trash extends Ability implements IAbility{

	private Card targetedCard;
	
	public Trash(int amount)
	{
			
			this.amount =amount;
			
	}
	
	public void playAbility(Player target) 
	{
		
		for(int i = 0; i<amount;i++ ){
			
			
		}
	}
}
