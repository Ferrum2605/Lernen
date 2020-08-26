package uebung6_4_1;

import java.util.Random;

public class LowValueDice extends Dice{
	
	public LowValueDice(int id)
	{
		super(id);
	}
	
	public void rolltheDice()
	{
		Random random = new Random();
		value = random.nextInt(3) + 1;
	}

}
