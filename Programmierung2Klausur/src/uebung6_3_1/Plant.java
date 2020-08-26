package uebung6_3_1;

public class Plant {

	/*
	 * Attribute
	 */
	protected String type;
	protected float size;
	protected boolean isToxic;

	private static int noPlants;

	/*
	 * Methoden
	 */
	public Plant(String type, float size, boolean isToxic) {
		setAttributes(type, size, isToxic);
		noPlants++;
	}

	private void setAttributes(String type, float size, boolean isToxic) {
		this.type = type;
		this.size = size;
		this.isToxic = isToxic;
	}
	
	public void displayAttributes() {
		System.out.println("Typ: " + type);
		System.out.println("Größe: " + size);
		System.out.println("Giftig?: " + isToxic);
	}
	

	public void rise() {
		size = size * 1.1f;
	}

	public String getType() {
		return type;
	}

	public float getSize() {
		return size;
	}

	public boolean isToxic() {
		return isToxic;
	}

	public static int getNoPlants() {
		return noPlants;
	}
}