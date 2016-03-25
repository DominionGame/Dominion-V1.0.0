package javaClasses;
import java.util.ArrayList;
import java.util.List;

import Abilities.*;
import card.Card;
import card.*;
public class Main {
	public static void main(String[] args) {
			
		Game game = new Game("thomasgame");
		Deck deck = new Deck();
		for(int i=0;i<5;i++){
		deck.add(new Card("markt",5,"action",2));
		}
		
		game.kingdomPiles.add(deck);
		
		Player player1 = new Player("thomas",game);
		
		Card gaincard = new Card("gainer",5,"action",2);
		gaincard.addAbilities(new GainCard(6));
		
		player1.play(gaincard);
		
		player1.printPiles();
		
	}
	
}
