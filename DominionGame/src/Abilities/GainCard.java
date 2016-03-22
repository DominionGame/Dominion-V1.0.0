package Abilities;

import javaClasses.Player;

public class GainCard extends Ability implements IAbility{
	
	private int amount;
	
	public GainCard(int amount)
	{
			
			this.amount =amount;
			
	}
	@Override
	public void playAbility(Player target) 
	{
		
		for(int i = 0; i<amount;i++ ){
			
			target.gainCard();
		}
	}
	
	

}
