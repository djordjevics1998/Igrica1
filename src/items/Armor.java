package items;

public class Armor extends Item {
	public static final Armor RAGS = new Armor(4, 0.32),
			IMPERIAL_ARMOR = new Armor(12, 0.05);
	private double def, evasion;
	
	public Armor(double def, double evasion) {
		this.def = def;
		this.evasion = evasion;
	}
}
