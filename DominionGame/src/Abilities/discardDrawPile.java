package Abilities;
import javaClasses.*;
import card.*;

import javaClasses.Player;

public class discardDrawPile extends Ability implements IAbility{

	
	public discardDrawPile() {

	}
	
	@Override
	public void playAbility(Player target) {

		Deck temp = new Deck();
		
		temp.addAll(target.discardPile);
		temp.addAll(target.drawPile);
		
		target.discardPile = temp;
		target.drawPile.clear();
	}



	
}
