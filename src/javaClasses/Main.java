package javaClasses;
import java.util.ArrayList;
import java.util.List;

import Abilities.*;
import card.Card;
import card.*;
public class Main {
	public static void main(String[] args) {
			
		Game game = new Game("thomasgame");
		
		
		Player p1 = new Player("thomas",game);
		p1.addCardtoDrawPile(new Card("thomas",5,"lel",2));
		p1.addCardtoDrawPile(new Card("thomas",5,"lel",2));
		p1.drawCard();
		p1.drawCard();
		Card trasher = new Card("trasher",5,"lel",2);
		trasher.addAbilities(new AddActions(2));
		trasher.addAbilities(new Trash(1));
		p1.play(trasher);
		p1.printPiles();

		
	}
	
}
