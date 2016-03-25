package Abilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import card.Card;
import javaClasses.*;

public class Trash extends Ability implements IAbility{

	//private Card targetedCard;
	private int amount;
	public Trash(int amount)
	{
			
			this.amount =amount;
			
	}
	
	public void playAbility(Player target) 
	{
		Scanner in = new Scanner(System.in);

	    	System.out.println("Would you like to trash cards? answer yes/no");
	    	String input = in.nextLine();

			if(input.equals("yes"))
			{
				for(int i=0;i<amount;i++)
				{
					target.trashCard();
				}
			
			}else if(input.equals("no"))
			{
				System.out.println("No cards will be Trashed");	
			}else
			{
				System.out.println("The input was not correct , please respond to the question");
				this.playAbility(target);
			}
		
	}
	
}
