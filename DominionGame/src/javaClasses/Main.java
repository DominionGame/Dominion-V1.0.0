package javaClasses;
import java.util.ArrayList;
import java.util.List;

import Abilities.*;
import card.Card;
import card.*;
public class Main {
	public static void main(String[] args) {
			
		Game game = new Game("thomasgame");
		
		
		Player player1 = new Player("thomas",game);
		
		Card actioncard = new Card("Markt",5,"Action",3);
		actioncard.addAbilities(new AddActions(2));
		
		Card throneroom = new Card("Markt",5,"Action",3);
		throneroom.addAbilities(new MultiplyNext(2));
		
		player1.play(throneroom);
		player1.play(actioncard);
		
		
		System.out.println(player1.toString());
		player1.play(actioncard);
		
		
		System.out.println(player1.toString());
		
	}
	
}
