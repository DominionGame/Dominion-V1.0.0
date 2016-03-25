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
			while(targetedCardPile == null ){
				targetedCardPile = target.getGame().GetTargetPile();
				while(targetedCardPile.get(0).getCost() > maxCost ){
					System.out.println("The cost of that card is too high.");
					targetedCardPile = target.getGame().GetTargetPile();
				}
			}
			if(targetedCardPile.get(0).getCost() <= maxCost){
			
				target.discardPile.drawCard(targetedCardPile);
				
			}
			
			
			
			
	}
	public void settargetPile(Deck targetedCardPile){
		this.targetedCardPile = targetedCardPile;
	}
}
