package items;

import java.util.ArrayList;

public class Inventory {
	private ArrayList<Item> items;
	private int gold;
	
	public Inventory() {
		items = new ArrayList<>();
		gold = 0;
	}
	
	public int getGold() { return gold; }
}