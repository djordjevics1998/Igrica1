package entities;

import items.Armor;
import items.Weapon;

public class NPC {
	private int HP, MP;
	private Weapon weapon;
	private Armor armor;
	
	public NPC() {
		HP = 100;
		MP = 100;
	}
	
	public void equipWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void equipArmor(Armor armor) {
		this.armor = armor;
	}
}
