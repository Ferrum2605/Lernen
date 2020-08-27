package uebung7_1_1;

import java.util.ArrayList;

public class TreeNursery implements Partner{
	
	private String name;
	private ArrayList<Tree> trees;
	private int noTrees;
	
	public TreeNursery(String name)
	{
		this.name = name;
		trees = new ArrayList<>();
	}
	
	public void addTree(Tree t)
	{
		trees.add(t);
		noTrees++;
	}
	
	public void displayAttributes()
	{
		System.out.println("Baumschule: " + name);
		System.out.println("Unsere Bäume: ");
		for(Tree tree : trees)
		{
			tree.displayAttributes();
		}
		System.out.println("Anzahl Bäume: " + noTrees);
	}
	
	public void displayPartner()
	{
		displayAttributes();
	}
	

}
