package uebung7_1_1;

import java.util.ArrayList;

public class PlantPortal {
	
	private String name;
	private ArrayList<Partner> partners;
	
	public PlantPortal(String name)
	{
		this.name = name;
		partners = new ArrayList<>();
	}
	
	public void addPartner(Partner p)
	{
		partners.add(p);
	}
	
	public void displayAttributes()
	{
		System.out.println("Pflanzenportal: " + name);
		System.out.println(" Unsere Partner: ");
		for(Partner partner : partners)
		{
			partner.displayPartner();
		}
	}

}
