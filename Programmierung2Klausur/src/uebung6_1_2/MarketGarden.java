package uebung6_1_2;

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

}
