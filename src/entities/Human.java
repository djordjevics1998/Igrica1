package entities;

import interfaces.OnFightListener;
import interfaces.OnInteractionListener;
import items.Armor;
import items.Inventory;
import items.Weapon;

public abstract class Human implements OnFightListener {
	protected int HP, MP;
	protected Inventory inventory;
	protected Weapon weapon;
	protected Armor armor;
	protected final String name;
	
	public Human(String name) {
		HP = 100;
		MP = 100;
		inventory = new Inventory();
		this.name = name;
	}
	
	public void equipWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void equipArmor(Armor armor) {
		this.armor = armor;
	}
	
	@Override
	public int onAttackDamage() {
		return weapon.calculateAttack();
	}
	
	@Override
	public boolean onDefend(OnInteractionListener attacker) {
		int damage = attacker.onAttackDamage();
		HP = HP - damage;
		return HP >= 0;
	}
	
	public int getHP() {
		return HP;
	}
	
	public int getMP() {
		return MP;
	}
}
