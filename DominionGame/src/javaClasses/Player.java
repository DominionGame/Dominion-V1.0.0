package javaClasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import Abilities.Ability;
import card.*;

public class Player {
	private String name;
	private Game game;

	public Deck hand = new Deck();
	public Deck drawPile = new Deck();
	public Deck discardPile = new Deck();
	public Deck inPlay = new Deck();
	
	
	
	private int remainingActions =1;
	private int remainingBuys = 1;	
	private int remainingCoins =0;
	
	private int multiplyAmount = 1;
	private boolean multiplyNext = false;
	
	public Player(String name){		
		this.name = name;
	}
	public Player(String name, Game game){		
		this.name = name;
		this.game = game;
	}
	
	
	public void play(Card c){
		if(multiplyNext == true){	
			for(int i = 0;i< multiplyAmount;i++){
				for (Ability ability : c.getAbilities()) {
		
					ability.playAbility(this);
				}
			}
			multiplyNext = false;
		}else{
			for (Ability ability : c.getAbilities()) {
				
				ability.playAbility(this);
			}
		}
	}
	public Game getGame() {
		return game;
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
	public void multiplyNextAction(int amount){
		this.multiplyAmount = 2;
		this.multiplyNext = true;
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
	public void trashCard(){		
			
				try{
					System.out.println("What card would you like to trash from your hand?");
					System.out.println("Give an index between" + 1 + " and " +hand.size());
					Scanner in = new Scanner(System.in);
				    
					int indexCard = in.nextInt()-1;
					
					game.trashPile.add(hand.get(indexCard));
					hand.remove(indexCard);

	

				}catch(Exception e){
					e.printStackTrace();
					
					//System.out.println("Please give the index of your hand to delete from");
				}
			
	}
	
	//kaarten toevoegen aan drawpile
	public void addCardtoDrawPile(Card card){
		
		drawPile.add(card);
		//voeg kaart rechtstreeks toe aan drawPile
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
	public int getRemainingCoins() {
		return remainingCoins;
	}
	public int getRemainingBuys() {
		return remainingBuys;
	}
	public int getRemainingActions() {

		return remainingActions;
	}
	
	
	
}
