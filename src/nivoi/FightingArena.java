package nivoi;

import java.util.ArrayList;

import entities.Hero;
import interfaces.OnFightListener;
import interfaces.OnInteractionListener;

public class FightingArena {
	private Hero hero;
	private ArrayList<OnFightListener> enemies;
	
	public FightingArena(Hero hero, ArrayList<OnFightListener> enemies) {
		this.hero = hero;
		this.enemies = enemies;
	}
	
	public void start() {
		//if(str.equals("atk 0")) enemies.get(0).onDefend(hero);
		//hero.onDefend(enemies.get(l));
	}
}
