package Abilities;

import java.util.Scanner;

import javaClasses.Player;

public class RevealDiscard extends Ability implements IAbility {
	int amount;
	Scanner in = new Scanner(System.in);
	public RevealDiscard(int amount) {
		this.amount = amount;
	}

	@Override
	public void playAbility(Player target) {
		//Attack
		for(Player player: target.getGame().players){
			if(!player.getName().equals(target.getName()))
			{
				for(int i=0;i<amount;i++)
				{
					player.revealCard(player.drawPile.get(player.drawPile.size()-1));
					String answer="";
					System.out.println("Do you want to discard " + player.getName() +"'s Card ?(yes/no)");
					answer = in.nextLine();
					while(!answer.equals("yes") && !answer.equals("no")){
						System.out.println("You must answer with (yes/no).");
						answer = in.nextLine();
					}
					if(answer.equals("yes"))
					{
						player.discardPile.drawCard(player.drawPile);
					}
				}
			}
		}
		
	}

	
	
}
