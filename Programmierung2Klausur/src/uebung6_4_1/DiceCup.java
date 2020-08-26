package uebung6_4_1;

import java.util.ArrayList;

public class DiceCup {

	// Methoden
	public void rollTheDices(ArrayList<Dice> dices) {
		for (Dice dice : dices) {
			dice.rollTheDice();
		}
	}

	public void displayDices(ArrayList<Dice> dices) {
		for (Dice dice : dices) {
			dice.displayDice();
		}
	}

}
