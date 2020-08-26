package uebung6_1_1;

public class Startklasse {

	public static void main(String[] args) {

		System.out.println("Anzahl Pflanzen: " + Plant.getNoPlants());

		Tree t1 = new Tree("Eiche", 3.5f, false, TreeSpecies.LEAFTREE, false);
		Flower f2 = new Flower("Sonnenblume", 1.0f, false, "gelb", false);
		Flower f3 = new Flower("Roter Fingerhut", 0.1f, true, " rot", true);

		System.out.println("Anzahl Pflanzen: " + Plant.getNoPlants());

		t1.displayAttributes();
		f2.displayAttributes();
		f3.displayAttributes();

	}


}
