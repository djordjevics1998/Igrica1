package nivoi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import entities.Hero;
import entities.NPC;
import interfaces.OnFightListener;
import items.Armor;
import items.Weapon;
import main.Meni;

public class Nivo1 {
	private Scanner scanner;
	private Hero hero;
	
	public Nivo1(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void start() {
		String str;
		while(true) {
			hero = new Hero("Dusan");
			NPC guard = new NPC("Imperial guard");
			guard.equipWeapon(Weapon.IMPERIAL_SWORD);
			guard.equipArmor(Armor.IMPERIAL_ARMOR);
			System.out.println("Sensei: Hey, you, you are finally awake");
			scanner.nextLine();
			System.out.println("Sensei: Last night was truly exciting, wasn't it?");
			scanner.nextLine();
			System.out.println("Sensei: How did you manage to escape and get arrested again?");
			scanner.nextLine();
			System.out.println("You, Dusan, start to remember the last event before you blacked out...");
			scanner.nextLine();
			System.out.println("Guard: STOP RIGHT THERE YOU CRIMINAL SCUM");
			scanner.nextLine();
			System.out.println("Guard: All your stolen goods have been confiscated. The next choice is yours:");
			scanner.nextLine();
			System.out.println("Guard: Pay the court a fine or serve your sentence");
			System.out.println("g - pay 250 gold, e - try to escape, k - kill the Guard");
			while(true) {
				str = scanner.nextLine().toLowerCase();
				switch(str) {
				case "g":
					if(hero.getGold() >= 250) {
						System.out.println("STOP RIGHT THERE YOU CRIMINAL HACKER");
						scanner.nextLine();
						System.out.println("GAME END");
						return;
					}
					System.out.println("Guard: ARE YOU KIDDING ME, YOU ARE BROKE?!");
					scanner.nextLine();
					System.out.println("Guard: WE GOTTA BEAT YOU THEN");
					scanner.nextLine();
					System.out.println("You, Dusan, thinking how you are going to be covered in bruises, decide to fight instead");
					break;
				case "e":
					System.out.println("Deciding it's worth a try, you start running");
					scanner.nextLine();
					System.out.println("Guard: STOP RIGHT THERE");
					scanner.nextLine();
					System.out.println("*Guard casts the Voice of the emperor on you, you feel that you cannot escape, so you resist it enough to strike back!");
					break;
				case "k":
					System.out.println("Feeling that there is no chance for escape, you decide to strike the Guard");
					break;
					default:
						System.out.println("Guard: CAN'T YOU READ IT YOU CRIMINAL SCUM? ENTER g, e OR k");
						continue;
				}
				break;
			}
			scanner.nextLine();
			ArrayList<OnFightListener> enemies = new ArrayList<OnFightListener>();
			enemies.add(guard);
			NPC npc2 = new NPC("Pera");
			npc2.equipWeapon(Weapon.WOODCUTTER_AXE);
			npc2.equipArmor(Armor.RAGS);
			enemies.add(npc2);
			FightingArena fightingArena = new FightingArena(scanner, hero, enemies);
			fightingArena.start();
		}
	}
}
