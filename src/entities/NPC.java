package entities;

import items.Weapon;

public class NPC {
	private int HP, MP;
	private Weapon weapon;
	
	public NPC() {
		HP = 100;
		MP = 100;
	}
	
	public void equipWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
