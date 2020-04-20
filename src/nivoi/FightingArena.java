package nivoi;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Hero;
import entities.NPC;
import interfaces.OnFightListener;
import interfaces.OnInteractionListener;
import items.Weapon;

public class FightingArena {
	private Scanner scanner;
	private Hero hero;
	private ArrayList<OnFightListener> enemies;
	
	public FightingArena(Scanner scanner, Hero hero, ArrayList<OnFightListener> enemies) {
		this.scanner = scanner;
		this.hero = hero;
		this.enemies = enemies;
	}
	
	public boolean start() {
		while(true) {
			System.out.println("In front of you stand " + enemies.size() + " foes:");
			int turn = 0;
			while(enemies.size() > 0) {
				System.out.println("Hero: HP = " + hero.getHP() + ", MP = " + hero.getMP());
				System.out.println("Turn " + turn + " has started. Who will you attack?");
				for(int l = 0; l < enemies.size(); l++) System.out.println(l + ". " + enemies.get(l).overview());
				int target = Integer.parseInt(scanner.nextLine());
				boolean alive = enemies.get(target).onDefend(hero);
				if(!alive) enemies.remove(target);
				for(int l = 0; l < enemies.size(); l++) {
					boolean hero_alive = hero.onDefend(enemies.get(l));
					if(!hero_alive) return false;
				}
			}
			return true;
		}
	}
}
