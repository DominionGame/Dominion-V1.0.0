package Abilities;

import java.util.Scanner;

import card.Card;
import javaClasses.Player;

public class MoneyLender extends Ability implements IAbility{
	int amount;
	String cardName;
	Scanner in = new Scanner(System.in);
	
	public MoneyLender(int amount,String cardName) {
		this.amount=amount;
		this.cardName=cardName;
	}

	@Override
	public void playAbility(Player target) {
		Card matchedCard = new Card();
		for(Card c: target.hand){
			if(c.getName().equals(cardName)){
				matchedCard = c;
			}
		}
		if(matchedCard != null){
			System.out.println("There is a " + cardName + " card in your hand, would you like to trash it? (yes/no)");
			String answer = in.nextLine();
			while(!answer.equals("yes") && !answer.equals("no")){
				System.out.println("There is a " + cardName + " card in your hand, would you like to trash it? (yes/no)");
				answer = in.nextLine();
			}
			if(answer.equals("yes")){
				target.trashCard(matchedCard,target.hand);
				for(int i=0;i<amount;i++){
				target.addCoin();
				}
			}
		}
		
	}

	
	
}
