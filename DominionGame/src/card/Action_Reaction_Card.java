package card;

import java.util.Scanner;

public class Action_Reaction_Card extends Card{

	public Action_Reaction_Card() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Action_Reaction_Card(String name, int value, String type, int cost) {
		super(name, value, type, cost);
		// TODO Auto-generated constructor stub
	}

	public boolean reactToAttack(){
		Scanner in = new Scanner(System.in);
		String answer;
		System.out.println("Do you want to reveal your " + this.getName() + " Card?");
		answer = in.nextLine();
		while(!answer.equals("yes") && !answer.equals("no"))
		{
			System.out.println("You must answer with 'yes' or 'no'.");
			answer = in.nextLine();
		}
		if(answer.equals("yes")){
			return true;
		}else{
			return false;
		}
	}
}
