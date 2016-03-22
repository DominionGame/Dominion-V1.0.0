package javaClasses;
import java.util.ArrayList;
import java.util.List;

import Abilities.*;

public class Main {
	public static void main(String[] args) {
		List<Card> cardlist = new ArrayList<Card>();
		
		// Actiekaarten
		/*00*/cardlist.add(new Card("Cellar",0,"Action Card",2)); // 10 aanwezig
			cardlist.get(0).addAbilities(new AddActions(1));
		
		/*01*/cardlist.add(new Card("Chapel",0,"Action Card",2)); // 10 aanwezig
			//cardlist.get(1).addAbilities(new TrashCard(1));
		
		/*02*/cardlist.add(new Card("Moat",0,"Action - Reaction Card",2)); // 10 aanwezig
			cardlist.get(2).addAbilities(new DrawCard(2));
			
		/*03*/cardlist.add(new Card("Chancellor",0,"Action Card",3)); // 10 aanwezig
			cardlist.get(3).addAbilities(new AddCoin(2));
		
		/*04*/cardlist.add(new Card("Village",0,"Action Card",3)); // 10 aanwezig
			cardlist.get(4).addAbilities(new DrawCard(1));
			cardlist.get(4).addAbilities(new AddActions(2));
		
		/*05*/cardlist.add(new Card("Woodcutter",0,"Action Card",3)); // 10 aanwezig
			cardlist.get(5).addAbilities(new AddBuy(1));
			cardlist.get(5).addAbilities(new AddCoin(2));
		
		/*06*/cardlist.add(new Card("Workshop",0,"Action Card",3)); // 10 aanwezig
			cardlist.get(6).addAbilities(new GainCard(4));
		
		/*07*/cardlist.add(new Card("Bureaucrat",0,"Action - Attack Card",4)); // 10 aanwezig
			
		
		/*08*/cardlist.add(new Card("Feast",0,"Action Card",4)); // 10 aanwezig
			//cardlist.get(8).addAbilities(new TrashCard());
			
		/*09*/cardlist.add(new Card("Gardens",0,"Victory",4)); // 10 aanwezig
		
		
		/*10*/cardlist.add(new Card("Militia",0,"Action Card",4)); // 10 aanwezig
			
		
		/*11*/cardlist.add(new Card("Moneylender",0,"Action Card",4)); // 10 aanwezig
			//cardlist.get(11).addAbilities(new TrashCard);
		
		/*12*/cardlist.add(new Card("Remodel",0,"Action Card",4)); // 10 aanwezig
			
		
		/*13*/cardlist.add(new Card("Smithy",0,"Action Card",4)); // 10 aanwezig
			cardlist.get(13).addAbilities(new DrawCard(3));
		
		/*14*/cardlist.add(new Card("Spy",0,"Action - Attack Card",4)); // 10 aanwezig
		cardlist.get(14).addAbilities(new DrawCard(1));
		cardlist.get(14).addAbilities(new AddActions(1));
		
		
		/*15*/cardlist.add(new Card("Thief",0,"Action - Attack Card",4)); // 10 aanwezig
		
		
		/*16*/cardlist.add(new Card("Throne Room",0,"Action Card",4)); // 10 aanwezig
		
		
		/*17*/cardlist.add(new Card("Council Room",0,"Action Card",5)); // 10 aanwezig
		
		
		/*18*/cardlist.add(new Card("Festival",0,"Action Card",5)); // 10 aanwezig
		
		
		/*19*/cardlist.add(new Card("Laboratory",0,"Action Card",5)); // 10 aanwezig
		
		
		/*20*/cardlist.add(new Card("Library",0,"Action Card",5)); // 10 aanwezig
		
		
		/*21*/cardlist.add(new Card("Market",0,"Action Card",5)); // 10 aanwezig
		
		
		/*22*/cardlist.add(new Card("Mine",0,"Action Card",5)); // 10 aanwezig
		
		
		/*23*/cardlist.add(new Card("Witch",0,"Action - Attack Card",5)); // 10 aanwezig
		
		
		/*24*/cardlist.add(new Card("Adventurer",0,"Action Card",6)); // 10 aanwezig
		
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
