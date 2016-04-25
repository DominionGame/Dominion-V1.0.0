package javaClasses;
import java.util.ArrayList;
import java.util.List;

import Abilities.*;
import card.Card;
import card.*;
public class Main {
	public static void main(String[] args) {
		Game g= new Game("game1");

		g.fillGame();
		g.play();


		
	}
}
