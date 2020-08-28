package uebung2_8_1;

import java.util.Random;

import javafx.scene.image.Image;

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
	
	public Image getImage()
	{
		Image image = null;
		
		switch(value)
		{
		case 1: 
			image = new Image(getClass().getResource("/Bilder/one.PNG").toExternalForm());
			break;
		case 2:
			image = new Image(getClass().getResource("/Bilder/two.PNG").toExternalForm());
			break;
		case 3: 
			image = new Image(getClass().getResource("/Bilder/three.PNG").toExternalForm());
			break;
		case 4:
			image = new Image(getClass().getResource("/Bilder/four.PNG").toExternalForm());
			break;
		case 5: 
			image = new Image(getClass().getResource("/Bilder/five.PNG").toExternalForm());
			break;
		case 6:
			image = new Image(getClass().getResource("/Bilder/six.PNG").toExternalForm());
			break;
		}
		return image;
	}
	
	public void displayDice()
	{
		
	
		System.out.println(id + " - " + value);
		
		
	}
	

}


