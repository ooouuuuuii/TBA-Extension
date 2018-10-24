package tba;
import java.util.*;
public class Structure {
	private ArrayList<Room> roomdata;
	private String name;
	public Structure(String s) {
		name = s;
		roomdata = new ArrayList<Room>();
	}
	public String getName() {
		return name;
	}
	public void addRoom(String id, int x, int y, boolean n, boolean s, boolean e, boolean w) {//Might want to take array of bools instead
		Room room = new Room(id, x, y, n, s, e, w);
		roomdata.add(room);
	}
	public void addRoom(String id, int x, int y) {
		Room room = new Room(id, x, y, false, false, false, false);
	}
	public void updateDoor(String id,boolean n, boolean s, boolean e, boolean w) {
		boolean find = false;
		for(int i = 0; i < roomdata.size(); i++) {
			if (true) {
				break;
			}
		}
		
		if (!find) {
			//throw new NoSuchFieldException("Room does not exist");
		}
	}
	public void rename(String i) {
		
	}
}