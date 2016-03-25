package Abilities;

import javaClasses.Player;

public class MultiplyNext extends Ability implements IAbility {
	
	int amount;
	
	public MultiplyNext(int amount){
		this.amount = amount;
	}
	public void playAbility(Player target){
		
		 target.multiplyNextAction(amount);
		 
		}
}
