package javaClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
public ArrayList<Player> players;
public ArrayList<Deck> kingdomPiles;
public Deck trashPile;

public String name;

private int Current_Game_Phase;
private static final int Game_Phase_Action = 0;	
private static final int Game_Phase_Buy = 1;
private static final int Game_Phase_Discard = 2;

public Game(String name){
	this.name = name;
	players = new ArrayList<Player>(); 
	trashPile = new Deck();
	kingdomPiles = new ArrayList<Deck>();
}
public void play(){
	
	//brian
	
	Current_Game_Phase = 0;
	if(Current_Game_Phase == Game_Phase_Action){
		
		
		//Action Phase
		Current_Game_Phase +=1;
	}
	if(Current_Game_Phase == Game_Phase_Buy){
		
		//Buy Phase
		Current_Game_Phase +=1;
	}
	if(Current_Game_Phase == Game_Phase_Discard){
		
		//Discard Phase
		Current_Game_Phase = 0;
		
	}
	
}

public void addPlayer(Player p){
	this.players.add(p);
}

public Deck GetTargetPile(){
	try{
		System.out.println("Pick the kingdom card pile number you wish to gain from ( "+1+" to " + kingdomPiles.size());
		Scanner in = new Scanner(System.in);
	    
		int index = in.nextInt()-1;
		return kingdomPiles.get(index);

		
	}catch(Exception e){
		e.printStackTrace();
		return null;
		//System.out.println("Please give the index of your hand to delete from");
	}

}

}


