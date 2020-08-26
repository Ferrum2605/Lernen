package uebung6_3_1;

import java.util.ArrayList;

public class MarketGarden {
	
	private String name;
	private ArrayList<Plant> plants;
	private int noPlants;
	
	public MarketGarden(String name)
	{
		this.name = name;
		plants = new ArrayList<>();
		noPlants = 0;
	}
	
	public void addPlant(Plant plant)
	{
		plants.add(plant);
		noPlants++;
	}
	
	public void displayAttributes()
	{
		System.out.println("Gärtnerei: " + name);
		System.out.println("Anzahl Pflanzen: " + noPlants);
		for(Plant plant : plants)
		{
			plant.displayAttributes();
		}
	}
	
	public void riseAllBlooms()
	{
		for(Plant plant : plants)
		{
			if(plant instanceof Flower)
			{
				((Flower) plant).riseBloom();
			}
		}
	}

}
