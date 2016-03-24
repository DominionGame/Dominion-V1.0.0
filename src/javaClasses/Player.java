package javaClasses;

import Abilities.Ability;
import card.*;

public class Player {
	private String name;
	
	private Deck hand = new Deck();
	private Deck drawPile = new Deck();
	private Deck discardPile = new Deck();
	//eventueel een Deck van "Actieve"/"Gespeelde" kaarten?
	//zodat ze niet rechtstreeks naar de discardPile gaan maar van uit het speelveld naar de discard
	
	
	private int remainingActions =1;
	private int remainingBuys = 1;	
	private int remainingCoins =0;
	
	public Player(String name){		
		this.name = name;
	}
	
	public void play(Card c){
		
		for (Ability ability : c.getAbilities()) {
			ability.playAbility(this);
		}
		
	}
	
	public void drawCard(){
		hand.drawCard(drawPile);
		//trek een kaart van de drawpile
	}
	public void buyCard(Deck pile){
		hand.drawCard(pile);
		//koop een kaart van een bepaalde hoop (bv. de markt pile op het gameboard)
	}
	public void addAction(){
		remainingActions++;
	}
	
	public void addBuy(){
		remainingBuys++;
	}
	
	public void addCoin(){
		remainingCoins++;
	}
	
	public void gainCard(int maxCost,Deck pileToGainFrom){
		
		//Er wordt eerste gechecked of de kaart die men gained niet meer kost dan de toegelaten maxCost
		if(pileToGainFrom.get(pileToGainFrom.size()-1).getCost() >= maxCost){
		try {
			discardPile.drawCard(pileToGainFrom);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	public void trashCard(Card c){
		
	}
	//kaarten toevoegen aan drawpile
	public void addCardtoDrawPile(Card card){
		
		drawPile.add(card);
		//voeg kaart rechtstreeks toe aan drawPile
	}
	public Card getCard(Card card){
		return card;
	}
	public void printPiles(){
		
		System.out.println("-------------Hand-------------");
		for(Card c: hand){
			System.out.println(c.toString());
		}
		System.out.println("-------------DrawPile-------------");
		for(Card c: drawPile){
			System.out.println(c.toString());
		}
		System.out.println("-------------DiscardPile-------------");
		for(Card c: discardPile){
			System.out.println(c.toString());
		}
		
	}

	@Override
	public String toString() {
		return String.format("Name: %s | Remaining Actions: %s | Remaining Buys: %s | Remaining Coins: %s",name,remainingActions,remainingBuys,remainingCoins);
	}
	
	
}
