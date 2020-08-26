package uebung6_1_1;

public class Flower extends Plant{
	
	private String bloomColor;
	private boolean bloomIsOpen;
	
	
	public Flower(String type, float size, boolean isToxic, String bloomColor, boolean bloomIsOpen)
	{
	super(type,size,isToxic);
	this.bloomColor = bloomColor;
	this.bloomIsOpen = bloomIsOpen;
	}
	
	public void displayAttributes()
	{
		System.out.println("Typ: " + type);
		System.out.println("GrÃ¶ÃŸe: " + size);
		System.out.println("Giftig?: " + isToxic);
		System.out.println("Blütenfarbe: " + bloomColor);
		System.out.println(" Blüte geöffnet?: " + bloomIsOpen);
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
