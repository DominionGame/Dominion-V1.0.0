package javaClasses;
import java.util.ArrayList;
import java.util.List;

import Abilities.*;
import card.Card;
import card.*;
public class Main {
	public static void main(String[] args) {
		Game g= new Game("game1");

		g.addPlayer(new Player("thomas",g));
		g.addPlayer(new Player("bert",g));
		g.addPlayer(new Player("sam",g));
		
		Card spy = new Card("Spy",5,"lel",6);
		spy.addAbilities(new Adventurer(2,"Action"));
		Player p = new Player("thomas");

			for (int i=0; i<4;i++) {
	
				p.addCardtoDrawPile(new Card("Silver",5,"Treasure",6));
	
				
			}
			for (int i=0; i<1;i++) {
				p.addCardtoDrawPile(new Card("Copper",5,"Treasure",6));
				p.addCardtoDrawPile(new Card("Copper",5,"Treasure",6));
				p.addCardtoDrawPile(new Card("Militia",5,"Action",6));
				p.addCardtoDrawPile(new Card("Copper",5,"Treasure",6));
				p.addCardtoDrawPile(new Card("Copper",5,"Treasure",6));
				p.addCardtoDrawPile(new Card("Copper",5,"Treasure",6));
				p.addCardtoDrawPile(new Card("Copper",5,"Treasure",6));
				p.addCardtoDrawPile(new Card("Militia",5,"Action",6));
				p.addCardtoDrawPile(new Card("shouldnotbedrawn",5,"Treasure",6));
	
				
			}
			p.addCardtoDrawPile(new Card("Gold",5,"Treasure",6));
			p.drawCard();
			p.printPiles();
			p.play(spy);
			p.printPiles();

		
			
		

		
	}
}
