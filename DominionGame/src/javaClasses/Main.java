package javaClasses;
import java.util.ArrayList;
import java.util.List;

import Abilities.*;
import card.Card;
import card.*;
public class Main {
	public static void main(String[] args) {
			
		Game game = new Game("thomasgame");
		Card treasure = new Card("Copper",2,"Treasure",5);
		Card thief = new Card("thief",2,"Attack",5);
		thief.addAbilities(new Thief(2));
		
		game.addPlayer(new Player("thomas",game));
		game.addPlayer(new Player("bert",game));
		//game.addPlayer(new Player("brian",game));
		
		for(Player p: game.players){
			
			for(int i =0; i < 5;i++){
			p.addCardtoDrawPile(treasure);
			}
			
		}
		
		game.players.get(0).play(thief);
		game.players.get(0).printPiles();
		game.players.get(1).printPiles();
		
		System.out.println("Trashpile");
		for(Card c:game.trashPile){
			System.out.println(c.toString());
		}
	}
}
