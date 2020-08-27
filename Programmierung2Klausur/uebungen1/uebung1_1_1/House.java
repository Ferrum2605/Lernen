package uebung1_1_1;

import java.util.ArrayList;

public class House {
	
	public class Room
	{
		private String name;
		
		public Room(String name)
		{
			this.name = name;
		}
		
		public void displayRoom()
		{
			System.out.println(name);
		}
	}
	
	private ArrayList<Room> rooms;
	
	public House()
	{
		rooms= new ArrayList<>();
	}
	
	public void addRoom(Room room)
	{
		rooms.add(room);
	}
	
	public void addRooms(Room...rooms)
	{
		for(int i = 0; i < rooms.length; i++)
		{
			this.rooms.add(rooms[i]);
		}
	}
	
	public void displayRooms()
	{
		for(Room room : rooms)
		{
			room.displayRoom();
		}
	}

}
