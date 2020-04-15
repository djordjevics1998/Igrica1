package entities;

import items.Inventory;

public class Hero {
	private int HP, MP;
	private Inventory inventory;
	
	public Hero() {
		this.HP = 100;
		this.MP = 100;
		this.inventory = new Inventory();
	}
	
	public int getGold() { return inventory.getGold(); }
	
	public int getAttack() {
		return 5;
	}
}