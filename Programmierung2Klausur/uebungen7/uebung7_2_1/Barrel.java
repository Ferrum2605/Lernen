package uebung7_2_1;

public class Barrel {
	
	private int capacity;
	private int fluidLevel;
	
	public Barrel(int capacity)
	{
		this.capacity = capacity;
	}
	
	public void addFluid(int fluid) throws BarrelOverflowException
	{
		fluidLevel += fluid;
		if(fluidLevel>capacity)
		{
			throw new BarrelOverflowException("Das war der Tropfen, der das Fass zum �berlaufen gebracht hat");
		}
	}
	
	public void displayFluidLevel()
	{
		System.out.println("Fl�ssigkeitsstand: " + fluidLevel);
	}

}
