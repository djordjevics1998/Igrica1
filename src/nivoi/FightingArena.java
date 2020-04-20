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
			for(int l = 0; l < enemies.size(); l++) System.out.println(l + ". " + enemies.get(l).overview());
			scanner.nextLine();
		}
	}
}
