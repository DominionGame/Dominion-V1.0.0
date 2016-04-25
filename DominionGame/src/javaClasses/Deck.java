package javaClasses;
import java.util.ArrayList;
import java.util.Collections;

import card.Card;

public class Deck extends ArrayList<Card> {

	public void addCard(Card c){
		this.add(c);
	}
	
	public void drawCard(Deck pile){
		
		this.add(pile.get(pile.size()-1));
		pile.remove(pile.get(pile.size()-1));
		
	}
	public void takeCard(int index,Deck pile){

		this.add(pile.get(index));
		pile.remove(pile.get(index));
		
	}
	
	public void shuffle(){
		
		Collections.shuffle(this);
		
	}
	
	public void printDeck() {
		int i =1;
		for (Card card : this) {
		    System.out.println(i + " | "+card.toString());
		    i++;
		}
		System.out.println(System.lineSeparator());
	}
	
	
}
