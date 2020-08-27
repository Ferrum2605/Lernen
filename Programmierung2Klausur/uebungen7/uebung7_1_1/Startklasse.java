package uebung7_1_1;

public class Startklasse {

	public static void main(String[] args) {

		// Pflanzenportal
		PlantPortal p = new PlantPortal("Plantazon");

		// Partner des Pflanzenportals
		TreeNursery t = new TreeNursery("Benjamin Buchsbaum GmbH");
		try{
			Tree t1 = new Tree("Eiche", 4f, false, TreeSpecies.LEAFTREE, true);
			Tree t2 = new Tree("Ulme", 2f, false, TreeSpecies.LEAFTREE, true);
			Tree t3 = new Tree("Apfelbaum", 1.5f, false, TreeSpecies.LEAFTREE, true);
			t.addTree(t1);
			t.addTree(t2);
			t.addTree(t3);
		}
		catch(InvalidSizeException e){
			System.err.println(e.getMessage());
		}
		

		MarketGarden m = new MarketGarden("Dehner");
		try {
			Tree t4 = new Tree("Eiche", -3.5f, false, TreeSpecies.LEAFTREE, true);
			m.addPlant(t4); // impliziter Upcast
		} catch (InvalidSizeException e) {
			System.err.println(e.getMessage());
		}
		try {
			Flower f1 = new Flower("Sonnenblume", 1.0f, false, "gelb", false);
			m.addPlant(f1); // impliziter Upcast
		} catch (InvalidSizeException e) {
			System.err.println(e.getMessage());
		}
		try {
			Flower f2 = new Flower("Sonnenblume", 0.5f, false, "gelb", true);
			m.addPlant(f2); // impliziter Upcast
		} catch (InvalidSizeException e) {
			System.err.println(e.getMessage());
		}		

		p.addPartner(t); // impliziter Upcast
		p.addPartner(m); // impliziter Upcast

		// Ausgabe
		p.displayAttributes();

	}



}
