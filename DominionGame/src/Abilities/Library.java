package Abilities;

import javaClasses.Player;

public class Adventurer extends Ability implements IAbility{
	int amount;
	
	public Adventurer(int amount) {
		this.amount = amount;
	}

	@Override
	public void playAbility(Player target) {
		int amountleft = amount;
		while(amountleft != 0){
			
			
		}
	}

	
	
}
