package uebung6_4_1;

import java.util.Random;

public class Dice {

	/*
	 * Attribute
	 */
	private int id;
	protected int value;

	/*
	 * Methoden
	 */
	public Dice(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public int getValue() {
		return value;
	}

	public void rollTheDice() {
		Random random = new Random();
		value = random.nextInt(6) + 1;
	}

	public void displayDice() {
		System.out.println(id + " - " + value);
	}

}

