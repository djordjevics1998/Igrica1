package items;

import main.Global;

public class Weapon extends Item {
	public static final Weapon IMPERIAL_SWORD = new Weapon("Imperial sword", 10, 19, 0, 1),
			WOODCUTTER_AXE = new Weapon("Woodcutter axe", 5, 8, 0.35, 4.5);
	private int dmg_min, dmg_max;
	private double crit_chance, crit_mult;
	
	public Weapon(String name, int dmg_min, int dmg_max, double crit_chance, double crit_mult) {
		super(name);
		this.dmg_min = dmg_min;
		this.dmg_max = dmg_max;
		this.crit_chance = crit_chance;
		this.crit_mult = crit_mult;
	}
	
	public int calculateAttack() {
		/*double mult;
		if(Global.r.nextDouble() < crit_chance) mult = crit_mult;
		else mult = 1;*/
		double mult = Global.r.nextDouble() < crit_chance ? crit_mult : 1;
		return (int)(mult * (Global.r.nextDouble() * (dmg_max - dmg_min) + dmg_min));
	}
}
