package TestAbilities;

import static org.junit.Assert.*;
import Abilities.AddActions;
import org.junit.Test;
import card.*;
import Abilities.*;
import javaClasses.*;

public class TestAbilities {

	@Test
	public void testAddActions() {
		
		Card testCard = new Card("TestCard",4,"TestString",5);
		
		testCard.addAbilities(new AddActions(2));
		
		Player testPlayer = new Player("SomeName");
		
		int actionAmount = testPlayer.getRemainingActions();
		
		testPlayer.play(testCard);
		
		assertTrue("Error@Test",actionAmount == testPlayer.getRemainingActions() - 2);
					
		
	}
	
	@Test
	public void testAddBuy() {
		
		Card testCard = new Card("TestCard",4,"TestString",5);
		
		testCard.addAbilities(new AddBuy(2));
		
		Player testPlayer = new Player("SomeName");
		
		int buyAmount = testPlayer.getRemainingBuys();
		
		testPlayer.play(testCard);
		
		assertTrue("Error@Test",buyAmount == testPlayer.getRemainingBuys() - 2);
					
		
	}
	
	@Test
	public void testAddCoin() {
		
		Card testCard = new Card("TestCard",4,"TestString",5);
		
		testCard.addAbilities(new AddCoin(2));
		//Ability +1 coin toevoegen aan onze kaart
		Player testPlayer = new Player("SomeName");
		
		int coinAmount = testPlayer.getRemainingCoins();
		
		testPlayer.play(testCard);
		
		assertTrue("Error@Test",coinAmount == testPlayer.getRemainingCoins() - 2);
					
		
	}
	
	@Test
	public void testDrawCard() {
		
		Deck hand = new Deck();
		
		Card testCard = new Card("TestCard",4,"TestString",5);
		hand.addCard(testCard);
		
		
		
		//assertTrue("Error@Test",);
		//onafgewerkt ^ ?			
		
	}

}
