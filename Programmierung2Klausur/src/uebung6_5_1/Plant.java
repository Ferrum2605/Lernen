package uebung6_5_1;

public abstract class Plant {

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
	
	public abstract void displayAttributes();
	

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