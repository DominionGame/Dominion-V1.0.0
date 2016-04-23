package javaClasses;
import java.util.ArrayList;
import java.util.List;

import Abilities.*;
import card.Card;
import card.*;
public class Main {
	public static void main(String[] args) {
		Game g= new Game("game1");

		g.Fillpile(0, new Card("Estate",1,"Victory",2), 10);
		g.Fillpile(1, new Card("Duchy",3,"Victory",5), 10);
		g.Fillpile(2, new Card("Province",6,"Victory",8), 10);
		g.Fillpile(3, new Card("Copper",1,"Treasure",0), 10);
		g.Fillpile(4, new Card("Silver",2,"Treasure",3), 10);
		g.Fillpile(5, new Card("Gold",3,"Treasure",6), 10);
		
		g.cursePile.add(new Card("Curse",-1,"Treasure",0));
		g.cursePile.add(new Card("Curse",-1,"Treasure",0));
		g.cursePile.add(new Card("Curse",-1,"Treasure",0));
		g.cursePile.add(new Card("Curse",-1,"Treasure",0));
		g.cursePile.add(new Card("Curse",-1,"Treasure",0));
		g.cursePile.add(new Card("Curse",-1,"Treasure",0));
		g.cursePile.add(new Card("Curse",-1,"Treasure",0));
		g.cursePile.add(new Card("Curse",-1,"Treasure",0));
		g.cursePile.add(new Card("Curse",-1,"Treasure",0));
		g.cursePile.add(new Card("Curse",-1,"Treasure",0));
		
		Card curses = new Card("Beaucrat",5,"Action-Attack",6);
		curses.addAbilities(new drawCurse(2));
		
		Player p1 = new Player("Thomas",g);	
		Player p2 = new Player("Bert",g);	
		Player p3 = new Player("Mark",g);	
		Player p4 = new Player("Ward",g);	
		g.addPlayer(p1);
		g.addPlayer(p2);
		g.addPlayer(p3);
		g.addPlayer(p4);
		
		g.players.get(2).hand.add(new Action_Reaction_Card("Mote",2,"Action-Reaction",3));
		
		p1.hand.add(new Card("Silver",2,"Treasure",3));
		p1.hand.add(new Card("Silvertje",2,"Treasure",3));
		p1.hand.add((new Action_Reaction_Card("Mote",2,"Action-Reaction",3)));
		p1.hand.add(new Card("lgegegegeg",2,"Treasure",3));
		p1.drawPile.add(new Card("drawcard",2,"Treasure",3));
		p1.drawPile.add(new Card("drawcard",2,"Treasure",3));
		p1.drawPile.add(new Card("drawcard",2,"Treasure",3));
		p1.drawPile.add(new Card("drawcard",2,"Treasure",3));
		p1.drawPile.add(new Card("drawcard",2,"Treasure",3));
		p1.drawPile.add(new Action_Reaction_Card("drawcard",2,"Treasure",3));
		
		
		
		p1.play(curses);


		

		
			
		

		
	}
}
