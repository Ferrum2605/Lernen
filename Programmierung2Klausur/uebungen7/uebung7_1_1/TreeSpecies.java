package uebung7_1_1;

public enum TreeSpecies {
	
	LEAFTREE("Laubbaum", false),CONIFER("Konifer", true);
	
	private String name;
	private boolean isEvergreen;
	
	TreeSpecies(String name, boolean isEvergreen)
	{
		this.name = name;
		this.isEvergreen = isEvergreen;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getEvergreen()
	{
		return isEvergreen;
	}

}
