package javaClasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import Abilities.Ability;
import card.*;

public class Player {
	private String name;
	public String getName() {
		return name;
	}
	private Game game;

	public Deck hand = new Deck();
	public Deck drawPile = new Deck();
	public Deck discardPile = new Deck();
	public Deck inPlay = new Deck();
	
	
	
	private int remainingActions =1;
	private int remainingBuys = 1;	
	public void setRemainingBuys(int remainingBuys) {
		this.remainingBuys = remainingBuys;
	}
	private int remainingCoins =0;
	
	public void setRemainingCoins(int remainingCoins) {
		this.remainingCoins = remainingCoins;
	}
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
		this.inPlay.add(c);
		this.hand.remove(c);
		remainingActions--;
	}
	public void Reset(){
		remainingActions =1;
		remainingBuys = 1;	
		remainingCoins =0;
		
		multiplyAmount = 1;
		multiplyNext = false;
	}
	public Game getGame() {
		return game;
	}
	public void drawCard(){
		if(drawPile.isEmpty()){
			drawPile.addAll(discardPile);
			drawPile.shuffle();
			discardPile.clear();
			
		}
		if(drawPile.get(drawPile.size()-1).getType().equalsIgnoreCase("Treasure")){
			this.setRemainingCoins(getRemainingCoins() + drawPile.get(drawPile.size()-1).getValue());
		}
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
	public void revealCard(Card c){
		System.out.println(System.lineSeparator());
		System.out.println("Revealed by "+this.name + ": "+c);
		System.out.println(System.lineSeparator());
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
	public void trashCard(Card card, Deck cardpile){		
			
				try{					
					game.trashPile.add(card);
					cardpile.remove(card);

	

				}catch(Exception e){
					e.printStackTrace();
				}
			
	}
	public boolean shield(){
		Action_Reaction_Card card = new Action_Reaction_Card();
		for(Card c:this.hand){
			if(c.getClass()== Action_Reaction_Card.class){
				card = (Action_Reaction_Card)c;
				System.out.println(this.getName() +" has a reaction card.");
				return card.reactToAttack();
			}
		}
		return false;
	}
	
	//kaarten toevoegen aan drawpile
	public void addCardtoDrawPile(Card card){
		
		drawPile.add(card);
		//voeg kaart rechtstreeks toe aan drawPile
	}
	public void drawHand(){
		for(int i =0;i<5;i++){
			drawCard();
		}
	}
	public void discardHand(){
		this.discardPile.addAll(this.hand);
		this.hand.clear();
	}
	public boolean hasActionCards(){
		
		for(Card c:this.hand){
			if(c.getType().equalsIgnoreCase("Action") || c.getType().equalsIgnoreCase("Action-Attack") || c.getType().equalsIgnoreCase("Action-Reaction") ){
				return true;
			}
		}
		return false;
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
