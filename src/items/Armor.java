package items;

public class Armor extends Item {
	public static final Armor RAGS = new Armor("Rags", 4, 0.32),
			IMPERIAL_ARMOR = new Armor("Imperial armor", 12, 0.05);
	private double def, evasion;
	
	public Armor(String name, double def, double evasion) {
		super(name);
		this.def = def;
		this.evasion = evasion;
	}
}
