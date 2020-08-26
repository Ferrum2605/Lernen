package uebung6_1_1;

public class Startklasse {

	public static void main(String[] args) {

		System.out.println("Anzahl Pflanzen: " + Plant.getNoPlants());

		Plant p1 = new Plant("Eiche", 3.5f, false);
		Plant p2 = new Plant("Sonnenblume", 1.0f, false);
		Plant p3 = new Plant("Roter Fingerhut", 0.1f, true);

		System.out.println("Anzahl Pflanzen: " + Plant.getNoPlants());

		p1.displayAttriutes();
		p2.displayAttriutes();
		p3.displayAttriutes();

	}


}
