package Abilities;

import javaClasses.Player;

public class DrawCard extends Ability implements IAbility{
	
	private int amount;
	
	public DrawCard(int amount)
	{
			
			this.amount =amount;
			
	}
	@Override
	public void playAbility(Player target) 
	{
		
		for(int i = 0; i<amount;i++ ){
			
			target.drawCard();
		}
	}
	
	

}
