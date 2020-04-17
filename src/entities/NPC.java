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
}
