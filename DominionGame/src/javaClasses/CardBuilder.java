package javaClasses;

import card.Action_Attack_Card;
import card.Action_Card;
import card.Action_Reaction_Card;
import card.Card;
import Abilities.*;
public class CardBuilder {

	public CardBuilder() {

	}

	public Card Estate(){
		
		return new Card("Estate",1,"Victory",2);
	}
	public Card Duchy(){
		
		return new Card("Duchy",3,"Victory",5);
	}
	public Card Province(){
		
		return new Card("Province",6,"Victory",8);
	}
	public Card Copper(){
		
		return new Card("Copper",1,"Treasure",0);
	}
	public Card Silver(){
		
		return new Card("Silver",2,"Treasure",3);
	}
	public Card Gold(){
		
		return new Card("Gold",3,"Treasure",6);
	}
	public Card Curse(){
		
		return new Card("Curse",-1,"Victory",0);
	}
	public Card Cellar(){
		Card c = new Action_Card("Cellar",0,"Action",2);
		c.addAbilities(new AddActions(1));
		c.addAbilities(new DrawforeachDiscard());
		return c;
	}
	public Card Chapel(){
		Card c = new Action_Card("Chapel",0,"Action",2);
		c.addAbilities(new Trash(4));
		return c;
	}
	public Card Moat(){
		Card c = new Action_Reaction_Card("Moat",0,"Action",2);
		c.addAbilities(new DrawCard(2));
		return c;
	}
	public Card Chancellor(){
		Card c = new Action_Card("Chancellor",0,"Action",3);
		c.addAbilities(new AddCoin(2));
		c.addAbilities(new discardDrawPile());
		return c;
	}
	public Card Village(){
		Card c = new Action_Card("Village",0,"Action",3);
		c.addAbilities(new DrawCard(1));
		c.addAbilities(new AddActions(2));
		return c;
	}
	public Card Woodcutter(){
		Card c = new Action_Card("Woodcutter",0,"Action",3);
		c.addAbilities(new AddBuy(1));
		c.addAbilities(new AddCoin(2));
		return c;
	}
	public Card Workshop(){
		Card c = new Action_Card("Workshop",0,"Action",3);
		c.addAbilities(new GainCard(4));
		return c;
	}
	public Card Bureaucrat(){
		Card c = new Action_Attack_Card("Bureaucrat",0,"Action",4);
		c.addAbilities(new Bureaucrat());
		return c;
	}
	public Card Militia(){
		Card c = new Action_Card("Militia",0,"Action",4);
		c.addAbilities(new AddCoin(2));
		c.addAbilities(new discardToAmount(3));
		return c;
	}
	public Card Smithy(){
		Card c = new Action_Card("Smithy",0,"Action",4);
		c.addAbilities(new DrawCard(3));
		return c;
	}
	//Fillpile(0, new Card("Estate",1,"Victory",2), 10);
	//g.Fillpile(1, new Card("Duchy",3,"Victory",5), 10);
	//g.Fillpile(2, new Card("Province",6,"Victory",8), 10);
	//g.Fillpile(3, new Card("Copper",1,"Treasure",0), 10);
	//g.Fillpile(4, new Card("Silver",2,"Treasure",3), 10);
	//g.Fillpile(5, new Card("Gold",3,"Treasure",6), 10);
}
