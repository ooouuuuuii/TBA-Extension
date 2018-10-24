package tba;

public class Room {
	private String id;
	private int x, y;
	private boolean n, s, e, w;
	public Room(String i, int h, int v, boolean u, boolean d, boolean r, boolean l) {
		id = i;
		x = h; y = v;
		n = u; s = d; e = r; w = l;
	}
	public String getId() {
		return id;
	}
	public int getCoord(String axis) {
		if (axis.equals("x")) {
			return x;
		} else if (axis.equals("y")) {
			return y;
		} else {
			return -999;
		}
	}
	public boolean getDoor(String dir) {
		if (dir.equals("n")) {
			return n;
		} else if (dir.equals("s")) {
			return s;
		} else if (dir.equals("e")) {
			return e;
		} else if (dir.equals("w")) {
			return w;
		} else {
			return false;
		}
	}
}
