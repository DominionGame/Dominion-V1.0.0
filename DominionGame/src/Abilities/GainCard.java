package Abilities;
import javaClasses.Deck;
import javaClasses.Player;

public class GainCard extends Ability implements IAbility{
	
	private int maxCost;
	private Deck targetedCardPile;
	
	public GainCard(int maxCost)
	{
			
			this.maxCost = maxCost;
			
	}
	
	public void playAbility(Player target) 
	{
							
			target.gainCard(maxCost,targetedCardPile);
		
	}
	public void settargetPile(Deck targetedCardPile){
		this.targetedCardPile = targetedCardPile;
	}
}
