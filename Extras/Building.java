class Room {
	private int roomNo;

	public Room(int n) {
		System.out.println("Room created");
		this.roomNo = n;
	}
}

public class Building {
	public Room room;

	public Building() {
		this.room = new Room(20);
	}

	public Building(Room room) {
		System.out.println("Building created");
		this.room = room;
	}
	public static void main(String args[]) {
		Building b = new Building();
	}
}
