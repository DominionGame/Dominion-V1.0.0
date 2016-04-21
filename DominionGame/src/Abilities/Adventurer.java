package Abilities;

import javaClasses.Player;

public class Adventurer extends Ability implements IAbility {
	int amount;
	String type;
	public Adventurer(int amount,String type) {
		this.amount=amount;
		this.type=type;
	}

	@Override
	public void playAbility(Player target) {
		int amountLeft = amount;
		while(amountLeft != 0){
			target.revealCard(target.drawPile.get(target.drawPile.size()-1));
			if(target.drawPile.get(target.drawPile.size()-1).getType() == type){
				target.hand.drawCard(target.drawPile);
				amountLeft--;
			}else{
				target.discardPile.drawCard(target.drawPile);
			}			
		}
		
	}

	
	
}
