package Abilities;

import javaClasses.Player;

public class TrashGain extends Ability implements IAbility{

	int amount;
	String type;
	String targetPile;
	String GainLocation;
	
	public TrashGain(int amount) {
		
		this.amount=amount;
		
	}
	public TrashGain(int amount,String type) {
		
		this.amount=amount;
		this.type=type;
		
	}
	public TrashGain(int amount,String type,String GainLocation) {
		
		this.amount=amount;
		this.type=type;
		this.GainLocation=GainLocation;
	}

	@Override
	public void playAbility(Player target) {
		
		Trash Trash = new Trash(1,type);
		Trash.playAbility(target);
		System.out.println(target.getGame().trashPile.get((target.getGame().trashPile.size()-1)).getCost()+amount);
		GainCard g = new GainCard(target.getGame().trashPile.get((target.getGame().trashPile.size()-1)).getCost()+amount,type,GainLocation);
		
		g.playAbility(target);
		//GainCard gc = new GainCard(target.getGame().trashPile.get((target.getGame().trashPile.size()-1));
		
	}
	
	

}
