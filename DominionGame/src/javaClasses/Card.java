package javaClasses;
import java.util.List;

public class Card {

	private String name;
	private int value;
	private String type;
	private int cost;
	private List<String> abilities;
	
	public Card(String name, int value,String type,int cost){
		
	this.name = name;
	this.value = value;
	this.type = type;
	this.cost = cost;
		
	}
	
	public void addAbilities(String ability){
		
		abilities.add(ability);
	}
	
	public List<String> getAbilities(){
		return abilities;
	}
	@Override
	public String toString() {
		return String.format("Name: %s | Value: %s | Type: %s | cost: %s",name,value,type,cost);
	}
	
	
}
