package card;
import java.util.ArrayList;
import java.util.List;
import Abilities.Ability;

public class Card {

	private String name;
	private int value;
	public int getValue() {
		return value;
	}
	private String type;
	private int cost;
	private ArrayList<Ability> abilities = new ArrayList<Ability>();
	
	public Card(){}
	//empty constructor
	
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
	
	public String getType(){
		return type;
	}
	public String getName(){
		return name;
	}
	public int getCost(){
		return cost;
	}
	@Override
	public String toString() {
		return String.format("Name: %s | Value: %s | Type: %s | cost: %s | Aantal Abilities: %s",name,value,type,cost,abilities.size());
	}
	
	
}
