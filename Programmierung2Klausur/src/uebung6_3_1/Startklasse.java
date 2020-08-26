package uebung6_3_1;

public class Startklasse {

	public static void main(String[] args) {

		Tree t1 = new Tree("Eiche", 3.5f, false, TreeSpecies.LEAFTREE, false);
		Flower f2 = new Flower("Sonnenblume", 1.0f, false, "gelb", false);
		Flower f3 = new Flower("Roter Fingerhut", 0.1f, true, " rot", true);
		
		MarketGarden marketGarden = new MarketGarden("Obi");
		
		marketGarden.addPlant(t1);
		marketGarden.addPlant(f2);
		marketGarden.addPlant(f3);
		
		marketGarden.riseAllBlooms();
		
		marketGarden.displayAttributes();

	}


}
