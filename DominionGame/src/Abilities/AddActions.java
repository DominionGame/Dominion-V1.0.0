package Abilities;

import javaClasses.Player;

public class AddActions extends Ability implements IAbility {
	
private int amount;
	
	public AddActions(int amount){
		
		this.amount =amount;
		
	}
	
	public void playAbility(Player target){
		
		for(int i = 0; i<amount;i++ ){
			
			target.addAction();
		}
	}
}
