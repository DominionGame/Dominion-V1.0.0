package Abilities;

import javaClasses.Player;

public class AddCoin extends Ability implements IAbility{
	
	private int amount;
	
	public AddCoin(int amount)
	{
			
			this.amount =amount;
			
	}

	public void playAbility(Player target) 
	{
		
		for(int i = 0; i<amount;i++ ){
			
			target.addCoin();
		}
	}
}
