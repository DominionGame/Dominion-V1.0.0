package javaClasses;

import java.util.ArrayList;
import javaClasses.CardBuilder;
import java.util.Scanner;

import card.Card;

public class Game {
public ArrayList<Player> players;
public ArrayList<Deck> supplyPiles;

public Deck cursePile;
public Deck trashPile;

public String name;

int currentplayer = 0;
private int Current_Game_Phase =0;
private static final int Action_Phase = 0;	
private static final int Buy_Phase = 1;
private static final int Discard_Phase = 2;

public Game(String name){
	this.name = name;
	players = new ArrayList<Player>(); 
	trashPile = new Deck();
	cursePile = new Deck();
	supplyPiles = new ArrayList<Deck>();
}
public void play(){
	
	//next turn while none of the end conditions are met.
	while(!metEndCondition()){
		//updatePlayerProperties(getCurrentPlayer());
		//Action Phase
		System.out.println(getCurrentPlayer().getName() + " has entered the Action Phase");
		while(Current_Game_Phase == Action_Phase){
			
			if(!getCurrentPlayer().hasActionCards() || getCurrentPlayer().getRemainingActions() == 0){
				System.out.println(getCurrentPlayer().getName() + " had no Action cards and has left the Action Phase.");
				Current_Game_Phase = Buy_Phase;
				break;
			}
			
			Scanner in = new Scanner(System.in);
			System.out.println(getCurrentPlayer().getName() + " has "+getCurrentPlayer().getRemainingActions()+" Actions left.");
			System.out.println("Give the index of the card you want to play.");
			getCurrentPlayer().hand.printDeck();
			int input = in.nextInt();
			while(input > getCurrentPlayer().hand.size() || input < 0){
				in.nextInt();
			}
			if(input ==0){
				System.out.println(getCurrentPlayer().getName() + " has ended the Action Phase");
				Current_Game_Phase = Buy_Phase;
				break;
			}else{
				playCard(getCurrentPlayer().hand.get(input-1));
			}
			
		}
		//Buy Phase
		System.out.println(getCurrentPlayer().getName() + " has entered the Buy Phase");
		while(Current_Game_Phase == Buy_Phase){
			if(getCurrentPlayer().getRemainingCoins() ==0 || getCurrentPlayer().getRemainingBuys() ==0){
				Current_Game_Phase = Discard_Phase;
				break;
			}
			
			int i =1;
			for(Deck pile:supplyPiles){
				System.out.println(i +" | "+pile.get(0));
				i++;
			}
			System.out.println(getCurrentPlayer().getName() + " has "+getCurrentPlayer().getRemainingCoins()+" Coins and "+ getCurrentPlayer().getRemainingBuys()+" Buys.");
			Scanner in = new Scanner(System.in);
			System.out.println("Give the index of the card you wish to buy. Enter (0) to leave the Buy Phase.");
			
			int input =  in.nextInt();
			while(input > supplyPiles.size()|| input < 0){
				in.nextInt();
			}
			if(input ==0){
				System.out.println(getCurrentPlayer().getName() + " has ended the Buy Phase");
				Current_Game_Phase = Discard_Phase;
				break;
			}else{
				buyCard(supplyPiles.get(input-1));
			}
			
		}
		System.out.println(getCurrentPlayer().getName() + " has entered the discard Phase");
		while(Current_Game_Phase == Discard_Phase){
			getCurrentPlayer().Reset();
			getCurrentPlayer().discardHand();
			getCurrentPlayer().drawHand();
			if(isLastPlayer(currentplayer)){
				currentplayer=0;
			}
			else
			{ 
				currentplayer++;
			}
			
			
			Current_Game_Phase = 0;
			
		}
	}
}
public boolean metEndCondition(){
	int i = 0;
	
	//province pile empty end condition
	if(supplyPiles.get(2).isEmpty()){
		return true;
	}
	for(Deck pile: supplyPiles){
		if(pile.isEmpty()){
			i++;
		}
	}
	//3 or more kingdompiles empty end condition
	if(i>=3){
		return true;
	}
	return false;
	
	
}
public void buyCard(Deck pile){
	if(getCurrentPlayer().getRemainingBuys() > 0 ){
		if(pile.get(0).getCost() <= getCurrentPlayer().getRemainingCoins()){
			getCurrentPlayer().discardPile.drawCard(pile);
			System.out.println(getCurrentPlayer().getName() + " purchased: " + pile.get(0));
			getCurrentPlayer().setRemainingBuys(getCurrentPlayer().getRemainingBuys()-1);
			getCurrentPlayer().setRemainingCoins(getCurrentPlayer().getRemainingCoins()-pile.get(0).getCost());
		}else{System.out.println("You don't have enough coins to buy that card.");}
	}else{
		System.out.println("No remaining Buys.");
	}
}
public void playCard(Card c){
getCurrentPlayer().play(c);
}
public void addPlayer(Player p){
	this.players.add(p);
}
public Player getCurrentPlayer(){
	
	return this.players.get(currentplayer);
}
private boolean isLastPlayer(int currentplayer){
	
	if(currentplayer == this.players.size()-1){
		return true;
	}
	return false;
}
public Deck GetTargetPile(){
	try{
		System.out.println("Pick the kingdom card pile number you wish to gain from ( "+1+" to " + supplyPiles.size());
		Scanner in = new Scanner(System.in);
	    
		int index = in.nextInt()-1;
		return supplyPiles.get(index);

		
	}catch(Exception e){
		e.printStackTrace();
		return null;
		//System.out.println("Please give the index of your hand to delete from");
	}

}
public void updatePlayerProperties(Player p){
	p.setRemainingCoins(0);
	for(Card c:p.hand){
		if(c.getType().equalsIgnoreCase("Treasure")){
			for(int i=0;i<c.getValue();i++){
				getCurrentPlayer().addCoin();
			}
		}
	}
}
public void Fillpile(int index,Card c, int amount){
	this.supplyPiles.add(new Deck());
	for(int i=0;i<amount;i++){
		this.supplyPiles.get(index).add(c);
	}
	
}

public void fillGame(){
	
	CardBuilder cb = new CardBuilder();
	
	Fillpile(0, cb.Estate(), 10);
	Fillpile(1, cb.Duchy(), 10);
	Fillpile(2, cb.Province(), 10);
	Fillpile(3, cb.Copper(), 10);
	Fillpile(4, cb.Silver(), 10);
	Fillpile(5, cb.Gold(), 10);
	Fillpile(6, cb.Curse(), 20);
	Fillpile(7, cb.Cellar(), 8);
	Fillpile(8, cb.Chapel(), 8);
	Fillpile(9, cb.Moat(), 8);
	Fillpile(10, cb.Chancellor(), 8);
	Fillpile(11, cb.Village(), 8);
	Fillpile(12, cb.Woodcutter(), 8);
	Fillpile(13, cb.Workshop(), 8);
	Fillpile(14, cb.Bureaucrat(), 8);
	Fillpile(15, cb.Militia(), 8);
	Fillpile(16, cb.Smithy(), 8);
	
	Player p1 = new Player("Thomas",this);	
	Player p2 = new Player("Stijn",this);	
	Player p3 = new Player("Brian",this);	
	Player p4 = new Player("Benoit",this);
	this.addPlayer(p1);
	this.addPlayer(p2);
	this.addPlayer(p3);
	this.addPlayer(p4);
	
	for(Player p: players){
		for(int i =0;i<7;i++){
		p.addCardtoDrawPile(cb.Copper());
		}
		for(int i =0;i<3;i++){
		p.addCardtoDrawPile(cb.Estate());
		}
		p.drawPile.shuffle();
		p.drawHand();
	}

	
}
}



