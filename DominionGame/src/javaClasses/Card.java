package javaClasses;
import java.util.ArrayList;
import java.util.List;
import Abilities.Ability;

public class Card {

	private String name;
	private int value;
	private String type;
	private int cost;
	private ArrayList<Ability> abilities = new ArrayList<Ability>();
	
	public Card(String name, int value,String type,int cost){
		
	this.name = name;
	this.value = value;
	this.type = type;
	this.cost = cost;
		
	}
	
	public void addAbilities(Ability ability){
		
		abilities.add(ability);
	}
	
	public List<Ability> getAbilities(){
		return abilities;
	}
	@Override
	public String toString() {
		return String.format("Name: %s | Value: %s | Type: %s | cost: %s",name,value,type,cost);
	}
	
	
}
