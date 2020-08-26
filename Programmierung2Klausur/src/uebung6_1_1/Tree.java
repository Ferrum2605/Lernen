package uebung6_1_1;

public class Tree extends Plant{
	
	private TreeSpecies treeSpecies;
	private boolean isStandalone;
	
	public Tree(String type, float size, boolean isToxic, TreeSpecies treeSpecies, boolean isStandalone)
	{
		super(type,size,isToxic);
		this.treeSpecies=treeSpecies;
		this.isStandalone=isStandalone;
	}
	
	public void displayAttributes()
	{
		System.out.println("Typ: " + type);
		System.out.println("Größe: " + size);
		System.out.println("Giftig?: " + isToxic);
		System.out.println("Baumart: " + treeSpecies.getName());
		System.out.println("Immergr�n?: " + treeSpecies.getEvergreen());
		System.out.println("Freistehend?: " + isStandalone);
	}
	
	public void rustle()
	{
		System.out.println("Raschel, Raschel!!!");
	}

}
