package Abilities;
import javaClasses.Deck;
import javaClasses.Player;

public class GainCard extends Ability implements IAbility{
	
	private int maxCost;
	private String CardType;
	private Deck targetedCardPile;
	private String GainToLocation;
	
	public GainCard(int maxCost)
	{
			
			this.maxCost = maxCost;
			
	}
	public GainCard(int maxCost,String CardType)
	{
			
			this.maxCost = maxCost;
			this.CardType= CardType;
	}
	public GainCard(int maxCost,String CardType,String GainLocation)
	{
			
			this.maxCost = maxCost;
			this.CardType= CardType;
			this.GainToLocation=GainLocation;
	}
	
	public void playAbility(Player target) 
	{
			while(targetedCardPile == null ){
				targetedCardPile = target.getGame().GetTargetPile();
				if(CardType==null)
				{
					while(targetedCardPile.get(0).getCost() > maxCost ){
						System.out.println("The cost of that card is too high.");
						targetedCardPile = target.getGame().GetTargetPile();
					}
				}
				if(CardType!=null){
					while(targetedCardPile.get(0).getCost() > maxCost || targetedCardPile.get(0).getType() != CardType){
						System.out.println("The cost can't be higher then "+maxCost+" and must be a " + CardType + " Card.");
						targetedCardPile = target.getGame().GetTargetPile();
					}
				}
			}
			if(targetedCardPile.get(0).getCost() <= maxCost){
				if(GainToLocation == "Hand"){
					target.hand.drawCard(targetedCardPile);
				}else{
				target.discardPile.drawCard(targetedCardPile);
				}
				targetedCardPile = null;	

			}
			
			
			
			
	}

}
