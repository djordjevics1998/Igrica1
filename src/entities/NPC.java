package entities;

import interfaces.OnInteractionListener;
import items.Armor;
import items.Weapon;

public class NPC extends Human {
	
	public NPC(String name) {
		super(name);
	}


	@Override
	public int onAttackDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean onDefend(OnInteractionListener attacker) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String overview() {
		return name + " equipped with " + armor.getName() + " and " + weapon.getName();
	}
}
