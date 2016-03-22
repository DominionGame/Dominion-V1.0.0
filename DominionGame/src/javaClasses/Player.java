package javaClasses;

public class Player {
	private int naam;
	
	private Deck hand;
	private Deck drawPile;
	private Deck discardPile;
	
	private int numberOfActions =1;
	private int numberOfBuys =1;
	
	
	public void play(Card c){
		for (String ability : c.getAbilities()) {
		    //voer elke ability uit
		}
	}
}
