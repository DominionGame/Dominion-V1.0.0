package javaClasses;
import java.util.ArrayList;
import java.util.List;

import Abilities.*;

public class Main {

	public static void main(String[] args) {

		Card c = new Card("Blacksmith",5,"Action Card",2);
		System.out.println(c.toString());
		
		c.addAbilities(new Ability());			
		c.addAbilities(new DrawCard(3));
	}

}
