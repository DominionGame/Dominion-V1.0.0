package Abilities;

import java.util.Scanner;

import javaClasses.Deck;
import javaClasses.Player;

public class discardToAmount extends Ability implements IAbility{
	
	int amount;
	
	public discardToAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public void playAbility(Player target) {
		Scanner in = new Scanner(System.in);
		
		for(Player player : target.getGame().players){
			if(!player.getName().equals(target.getName())){
				while(player.hand.size() > amount){	
					player.hand.printDeck();
					System.out.println("Give the index of the card to discard from your hand.");
					int index = in.nextInt();	
					while(index < 0 && index > player.hand.size())
					{	
						System.out.println("Please enter an index from 1 to " + player.hand.size());
						index = in.nextInt();
					}
					player.discardPile.takeCard(index-1, player.hand);
					System.out.println("Discarded card was : " + player.discardPile.get(player.discardPile.size()-1));
				}
			}
		}
		
		
		
	}
}
