package uebung7_1_1;

public class Flower extends Plant{
	
	private String bloomColor;
	private boolean bloomIsOpen;
	
	
	public Flower(String type, float size, boolean isToxic, String bloomColor, boolean bloomIsOpen) throws InvalidSizeException
	{
	super(type,size,isToxic);
	this.bloomColor = bloomColor;
	this.bloomIsOpen = bloomIsOpen;
	}
	
	public void displayAttributes()
	{
		System.out.println("Typ: " + type);
		System.out.println("Gr��e: " + size);
		System.out.println("Giftig?: " + isToxic);
		System.out.println("Bl�tenfarbe: " + bloomColor);
		System.out.println("Bl�te ge�ffnet?: " + bloomIsOpen);
		System.out.println();
	}
	
	public void riseBloom()
	{
		bloomIsOpen = true;
	}
	
	public void closeBloom()
	{
		bloomIsOpen = false;
	}
	

}
