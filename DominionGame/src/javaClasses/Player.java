package javaClasses;

import Abilities.Ability;

public class Player {
	private int naam;
	
	private Deck hand;
	private Deck drawPile;
	private Deck discardPile;
	
	private int remainingActions =1;
	private int remainingBuys = 1;
	
	private int extraCoins =0;
	
	
	public void play(Card c){
		for (Ability ability : c.getAbilities()) {
			ability.playAbility(this);
		}
	}
	
	public void drawCard(){
		hand.drawCard(drawPile);
	}
	
	public void addAction(){
		remainingActions++;
	}
	
	public void addBuy(){
		remainingBuys++;
	}
}
