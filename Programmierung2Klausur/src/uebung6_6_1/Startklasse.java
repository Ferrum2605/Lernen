package uebung6_6_1;

public class Startklasse {

	public static void main(String[] args) {

		// Pflanzenportal
		PlantPortal p = new PlantPortal("Plantazon");

		// Partner des Pflanzenportals
		TreeNursery t = new TreeNursery("Benjamin Buchsbaum GmbH");
		Tree t1 = new Tree("Eiche", 4f, false, TreeSpecies.LEAFTREE, true);
		Tree t2 = new Tree("Ulme", 2f, false, TreeSpecies.LEAFTREE, true);
		Tree t3 = new Tree("Apfelbaum", 1.5f, false, TreeSpecies.LEAFTREE, true);
		t.addTree(t1);
		t.addTree(t2);
		t.addTree(t3);

		MarketGarden m = new MarketGarden("Dehner");
		Tree t4 = new Tree("Eiche", 3.5f, false, TreeSpecies.LEAFTREE, true);
		Flower f1 = new Flower("Sonnenblume", 1.0f, false, "gelb", false);
		Flower f2 = new Flower("Sonnenblume", 0.5f, false, "gelb", true);
		m.addPlant(t4); // impliziter Upcast
		m.addPlant(f1); // impliziter Upcast
		m.addPlant(f2); // impliziter Upcast

		p.addPartner(t); // impliziter Upcast
		p.addPartner(m); // impliziter Upcast

		// Ausgabe
		p.displayAttributes();

	}



}
