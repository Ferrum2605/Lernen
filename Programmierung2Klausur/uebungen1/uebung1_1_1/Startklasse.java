package uebung1_1_1;

import uebung1_1_1.House.Room;

public class Startklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		House house = new House();
		House.Room r1 = house.new Room("Küche");
		House.Room r2 = house.new Room("Wohnzimmer");
		House.Room r3 = house.new Room("Schlafzimmer");
		House.Room r4 = house.new Room("Badezimmer");
		
		/*
		house.addRoom(r1);
		house.addRoom(r2);
		house.addRoom(r3);
		house.addRoom(r4);
		*/
		
		house.addRooms(r1, r2, r3, r4);
		
		house.displayRooms();

	}

}
