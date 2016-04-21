package Abilities;

import java.util.Scanner;

import javaClasses.Player;

public class Library extends Ability implements IAbility{
	int amount;
	Scanner in = new Scanner(System.in);
	public Library(int amount) {
		this.amount = amount;
	}

	@Override
	public void playAbility(Player target) {
		int amountleft = amount-target.hand.size();
		while(amountleft > 0 && !(amountleft <0) ){
			
			
			target.drawCard();
			amountleft--;
			if(target.hand.get(target.hand.size()-1).getType() == "Action"){
				System.out.println(target.hand.get(target.hand.size()-1));
				System.out.println("Would you like to set this card aside ?");
				String answer ="";
				while(!answer.equals("yes") && !answer.equals("no")){
					System.out.println("You must answer with (yes/no).");
					answer = in.nextLine();
				}
				if(answer.equals("yes"))
				{
					target.discardPile.drawCard(target.hand);
					amountleft++;
				}
			}
		}
	}

	
	
}
