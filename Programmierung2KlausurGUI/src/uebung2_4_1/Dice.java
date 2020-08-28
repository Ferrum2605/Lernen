package uebung2_4_1;

import java.util.Random;

public class Dice {
	
	private int id;
	private int value;
	
	
	public Dice(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void rollTheDice()
	{
		Random random = new Random();
		value = random.nextInt(6)+1;
	}
	
	public void displayDice()
	{
		
	
		System.out.println(id + " - " + value);
		
		
	}
	

}


