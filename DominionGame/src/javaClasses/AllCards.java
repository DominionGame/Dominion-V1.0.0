package javaClasses;
import java.util.ArrayList;
import java.util.List;

import Abilities.*;

public class AllCards {
	public static void main(String[] args) {
		List<Card> cardlist = new ArrayList<Card>();
		
		// Actiekaarten
		/*00*/cardlist.add(new Card("Cellar",0,"Action Card",2)); // 10 aanwezig
			cardlist.get(0).addAbilities(new AddActions(1));
			cardlist.get(0).addAbilities(new DiscardCard(/*zoveel speler wil*/, "self"));
			cardlist.get(0).addAbilities(new DrawCard(/*evenveel als discarded*/));
		
		/*01*/cardlist.add(new Card("Chapel",0,"Action Card",2)); // 10 aanwezig
			cardlist.get(1).addAbilities(new TrashCard(/*tot 4*/));
		
		/*02*/cardlist.add(new Card("Moat",0,"Action - Reaction Card",2)); // 10 aanwezig
			cardlist.get(2).addAbilities(new DrawCard(2));
			cardlist.get(2).addAbilities(new Reaction());
			
		/*03*/cardlist.add(new Card("Chancellor",0,"Action Card",3)); // 10 aanwezig
			cardlist.get(3).addAbilities(new AddCoin(2));
			cardlist.get(3).addAbilities(new DiscardCard(/*Alle kaarten die je hebt*/, "self"));
		
		/*04*/cardlist.add(new Card("Village",0,"Action Card",3)); // 10 aanwezig
			cardlist.get(4).addAbilities(new DrawCard(1));
			cardlist.get(4).addAbilities(new AddActions(2));
		
		/*05*/cardlist.add(new Card("Woodcutter",0,"Action Card",3)); // 10 aanwezig
			cardlist.get(5).addAbilities(new AddBuy(1));
			cardlist.get(5).addAbilities(new AddCoin(2));
		
		/*06*/cardlist.add(new Card("Workshop",0,"Action Card",3)); // 10 aanwezig
			cardlist.get(6).addAbilities(new GainCard(4));
		
		/*07*/cardlist.add(new Card("Bureaucrat",0,"Action - Attack Card",4)); // 10 aanwezig
			cardlist.get(7).addAbilities(new GainCard("silver"));
			cardlist.get(7).addAbilities(new RevealCard(1, "other", "victory") /*als er zijn*/);
			//Legt de victory card op drawpile
		
		/*08*/cardlist.add(new Card("Feast",0,"Action Card",4)); // 10 aanwezig
			cardlist.get(8).addAbilities(new TrashCard(/*deze kaart*/));
			cardlist.get(8).addAbilities(new GainCard(5));
			
		/*09*/cardlist.add(new Card("Gardens",0,"Victory",4)); // 10 aanwezig
			//niet legbaar, enkel nuttig op einde spel
		
		/*10*/cardlist.add(new Card("Militia",0,"Action Card",4)); // 10 aanwezig
			cardlist.get(10).addAbilities(new AddCoin(2));
			cardlist.get(10).addAbilities(new DiscardCard(2, "other"));
		
		/*11*/cardlist.add(new Card("Moneylender",0,"Action Card",4)); // 10 aanwezig
			cardlist.get(11).addAbilities(new TrashCard("copper"));
			cardlist.get(11).addAbilities(new AddCoin(3)); //enkel als er effectief een koperkaart vernietigd is
		
		/*12*/cardlist.add(new Card("Remodel",0,"Action Card",4)); // 10 aanwezig
			cardlist.get(12).addAbilities(new TrashCard(1));
			cardlist.get(12).addAbilities(new GainCard(/*Een die tot $2 meer waard is dan de vernietigde*/));
		
		/*13*/cardlist.add(new Card("Smithy",0,"Action Card",4)); // 10 aanwezig
			cardlist.get(13).addAbilities(new DrawCard(3));
		
		/*14*/cardlist.add(new Card("Spy",0,"Action - Attack Card",4)); // 10 aanwezig
			cardlist.get(14).addAbilities(new DrawCard(1));
			cardlist.get(14).addAbilities(new AddActions(1));
			cardlist.get(14).addAbilities(new RevealCard(1, "all", "top"));
		
		/*15*/cardlist.add(new Card("Thief",0,"Action - Attack Card",4)); // 10 aanwezig
			cardlist.get(15).addAbilities(new RevealCard(2, "other", "top"));
			// geldkaarten vernietigen
		
		/*16*/cardlist.add(new Card("Throne Room",0,"Action Card",4)); // 10 aanwezig
			// speel een actiekaart tweemaal
		
		/*17*/cardlist.add(new Card("Council Room",0,"Action Card",5)); // 10 aanwezig
			cardlist.get(17).addAbilities(new DrawCard(4));
			cardlist.get(17).addAbilities(new AddBuy(1));
			cardlist.get(17).addAbilities(new DrawCard(1), "other"); //andere spelers nemen ook een kaart
		
		/*18*/cardlist.add(new Card("Festival",0,"Action Card",5)); // 10 aanwezig
			cardlist.get(18).addAbilities(new AddActions(2));
			cardlist.get(18).addAbilities(new AddBuy(1));
			cardlist.get(18).addAbilities(new AddCoin(2));
		
		/*19*/cardlist.add(new Card("Laboratory",0,"Action Card",5)); // 10 aanwezig
			cardlist.get(19).addAbilities(new DrawCard(2));
			cardlist.get(19).addAbilities(new AddActions(1));	
		
		/*20*/cardlist.add(new Card("Library",0,"Action Card",5)); // 10 aanwezig
			cardlist.get(20).addAbilities(new DrawCard(/*tot 7*/));
			/* Draw until you have 7 cards in hand.
			 * You may set aside any Action cards drawn this way,
			 * as you draw them; discard the set aside cards
			 * after you finish drawing.*/
		
		/*21*/cardlist.add(new Card("Market",0,"Action Card",5)); // 10 aanwezig
			cardlist.get(21).addAbilities(new DrawCard(1));	
			cardlist.get(21).addAbilities(new AddActions(1));
			cardlist.get(21).addAbilities(new AddBuy(1));
			cardlist.get(21).addAbilities(new AddCoin(1));
		
		/*22*/cardlist.add(new Card("Mine",0,"Action Card",5)); // 10 aanwezig
			/* Trash a Treasure card from your hand.
			 * Gain a Treasure card costing up to $3 more;
			 * put it into your hand.
			 */
		
		/*23*/cardlist.add(new Card("Witch",0,"Action - Attack Card",5)); // 10 aanwezig
			cardlist.get(23).addAbilities(DrawCard(2));
			// Iedere andere speler pakt een curse
		
		/*24*/cardlist.add(new Card("Adventurer",0,"Action Card",6)); // 10 aanwezig
			/* Reveal cards from your deck until you reveal
			 * 2 Treasure cards. Put those Treasure cards
			 * in your hand and discard the other revealed cards.
			 */
		
		
		// Geldkaarten
		cardlist.add(new Card("Copper",1,"Treasure",0)); // 46 aanwezig (nadat beide spelers 7 koper hebben om te beginnen)
		cardlist.add(new Card("Silver",2,"Treasure",3)); // 40 aanwezig
		cardlist.add(new Card("Gold",3,"Treasure",6)); // 30 aanwezig
		
		// Victoriekaarten
		cardlist.add(new Card("Estate",1,"Victory",2)); // 8 aanwezig
		cardlist.add(new Card("Duchy",3,"Victory",5)); // 8 aanwezig
		cardlist.add(new Card("Province",6,"Victory",8)); // 8 aanwezig
		cardlist.add(new Card("Curse",-1,"Curse",0)); // 10 aanwezig
	}
}