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
	String CardType;
	public Trash()
	{
			
	}
	public Trash(int amount)
	{
			
			this.amount =amount;
			
	}
	public Trash(int amount,String CardType)
	{
			
			this.amount =amount;
			this.CardType = CardType;
			
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
					int indexCard = 0;
					//target.trashCard();
					displayMessage();	
					System.out.println("Give an index between " + 1 + " and " +target.hand.size());
					//Scanner in = new Scanner(System.in);
					indexCard = in.nextInt()-1;
					//int indexCard = in.nextInt()-1;
					if(CardType!=null)
					{
						
						while(target.hand.get(indexCard).getType() != CardType){
							System.out.println("The card must be a " + CardType + " Card.");
							System.out.println("Give an index between " + 1 + " and " +target.hand.size());
							try{
							indexCard = in.nextInt()-1;
							}catch(Exception e){
								System.out.println("You did not give an index.");
							}
						}
						
					}
					if(CardType!=null)
					{
						
						while(target.hand.get(indexCard).getType() != CardType){
							System.out.println("The card must be a " + CardType + " Card.");
							System.out.println("Give an index between " + 1 + " and " +target.hand.size());
							try{
							indexCard = in.nextInt()-1;
							}catch(Exception e){
								System.out.println("You did not give an index.");
							}
						}
						
					}
					Card trashedCard = target.hand.get(indexCard);
					
					
					target.getGame().trashPile.add(target.hand.get(indexCard));
					System.out.println("Trashed Card:"+ trashedCard);
					target.hand.remove(indexCard);
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
	
	void displayMessage(){
		if(CardType!=null){
			System.out.println("Choose a "+ CardType +" Card from your hand");
		}if(CardType==null){
			System.out.println("What card would you like to trash from your hand?");
		}
	}
	
}
