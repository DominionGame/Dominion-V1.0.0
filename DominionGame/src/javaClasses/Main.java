package javaClasses;
public class Main {
	public static void main(String[] args) {
		Card c = new Card("Blacksmith",5,"Action Card",2);
		
		Deck drawPile = new Deck();
		Deck hand = new Deck();
		// 3x kaart in drawpile
		drawPile.addCard(c);
		drawPile.addCard(c);
		drawPile.addCard(c);
		
		//kaart 2x trekken van drawPile
		
		hand.drawCard(drawPile);
		hand.drawCard(drawPile);
		drawPile.printDeck();
		
		
	}

}
