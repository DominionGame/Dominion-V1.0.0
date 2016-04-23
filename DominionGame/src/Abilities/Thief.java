package Abilities;

import java.util.Scanner;
import javaClasses.*;
import javaClasses.Player;

public class Thief extends Ability implements IAbility {
	int amount;
	boolean stealCard;
	public Thief(int amount)
	{
			
			this.amount = amount;
			boolean stealCard = true;
	}
	public void playAbility(Player target){
		//Attack
		stealCard = true;
		for(Player player: target.getGame().players)
		{
			//Voor elke speler behalve deze die de ability speelt.
			if(player.getName() != target.getName()&& player.shield() == false)
			{
				for(int i = 0; i < amount ;i++)
				{
					System.out.println(player.drawPile.get(player.drawPile.size()-1).toString());
					if(player.drawPile.get(player.drawPile.size()-1).getType() != "Treasure")
					{
						player.discardPile.drawCard(player.drawPile);
						//als het geen treasure kaart is, wordt hij naar de discardPile van de speler gestuurd.
					}else if(stealCard == true){
						Scanner in = new Scanner(System.in);
						System.out.println("Would you like to take this card from "+player.getName()+"?");
						String answer;
						answer = in.nextLine();
						while(!answer.equals("yes") && !answer.equals("no"))
						{
							System.out.println("You must answer with 'yes' or 'no'.");
							answer = in.nextLine();
						}
						
						if(answer.equals("no"))
						{
							target.getGame().trashPile.drawCard(player.drawPile);
							System.out.println("kaart werd getrashed");
							//trashpile trekt de kaart van de drawpile	
						}
						if(answer.equals("yes"))
						{
							target.discardPile.drawCard(player.drawPile);
							stealCard=false;
							//de kaart moet niet getrashed worden en gaat dus gewoon naar de discardPile van de speler
							//men mag maar 1 kaart stelen per speler
						}
						
						
					
					}
					else{
						target.getGame().trashPile.drawCard(player.drawPile);
						System.out.println("kaart werd getrashed");
						}
				
				}
				stealCard=true;
			}
				
		}	
		
	}
}
