package Abilities;

import card.Card;
import javaClasses.Player;

public class GainTrash extends Ability implements IAbility{
	int amount;
	
	public GainTrash(int amount) 
	{
		this.amount = amount;
	}

	@Override
	public void playAbility(Player target) {
		
		int maxCost = target.trashCard().getCost();
		GainCard gain = new GainCard(maxCost);
		gain.playAbility(target);
		
	}
	
	
}
