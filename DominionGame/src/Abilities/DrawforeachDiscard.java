package Abilities;

import java.util.Scanner;

import javaClasses.Player;

public class DrawforeachDiscard extends Ability implements IAbility{
	Scanner in;
	public DrawforeachDiscard() {
		in = new Scanner(System.in);
	}

	@Override
	public void playAbility(Player target) {
		int discardCounter=0;
		target.hand.printDeck();
		System.out.println("How many cards would you like to discard from your hand?");
		discardCounter = in.nextInt();
		for(int i = discardCounter;i>0;i--){
			target.hand.printDeck();
			System.out.println("Amount of cards left to discard: " + i);
			System.out.println("Give the index of the card you wish to discard.");
			int index = in.nextInt();
			while(index < 1 || index > target.hand.size()){
				System.out.println("Give the index between 1 & " + target.hand.size());
				index = in.nextInt();
			}
			target.discardPile.add(target.hand.get(index-1));
			target.hand.remove(index-1);
		}
		
		DrawCard drawAbility = new DrawCard(discardCounter);
		drawAbility.playAbility(target);
	}
	
}
