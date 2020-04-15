package items;

public class Weapon extends Item {
	public static final Weapon IMPERIAL_SWORD = new Weapon(10, 19, 0),
			WOODCUTTER_AXE = new Weapon(5, 8, 0.35);
	private int dmg_min, dmg_max;
	private double crit;
	
	public Weapon(int dmg_min, int dmg_max, double crit) {
		this.dmg_min = dmg_min;
		this.dmg_max = dmg_max;
		this.crit = crit;
	}
}
