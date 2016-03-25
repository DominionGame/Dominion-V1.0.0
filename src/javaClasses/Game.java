package javaClasses;

import java.util.ArrayList;

public class Game {
private ArrayList<Player> players;	
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

}


