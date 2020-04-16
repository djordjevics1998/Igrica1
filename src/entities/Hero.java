package entities;

import items.Armor;
import items.Inventory;
import items.Weapon;

public class Hero {
	private int HP, MP;
	private Inventory inventory;
	private Weapon weapon;
	private Armor armor;
	
	public Hero() {
		this.HP = 100;
		this.MP = 100;
		this.inventory = new Inventory();
	}
	
	public int getGold() { return inventory.getGold(); }
	
	public int getAttack() {
		return 5;
	}
	
	public void equipWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void equipArmor(Armor armor) {
		this.armor = armor;
	}
}