package entities;

import interfaces.OnInteractionListener;
import items.Armor;
import items.Inventory;
import items.Weapon;

public class Hero extends Human {
	
	public Hero(String name) {
		super(name);
	}
	
	public int getGold() { return inventory.getGold(); }
	
	
	@Override
	public int onAttackDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean onDefend(OnInteractionListener attacker) {
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String overview() {
		// TODO Auto-generated method stub
		return null;
	}
}