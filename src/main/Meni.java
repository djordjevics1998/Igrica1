package main;

import java.util.Random;
import java.util.Scanner;

import nivoi.Nivo1;

public class Meni {
	private Scanner scanner;
	
	public Meni(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void start() {
		String str;
		while(true) {
			System.out.println("TESVI: STOPPING RIGHT THERE");
			System.out.println("New game, Quit");
			str = scanner.nextLine();
			switch(str) {
			case "New game":
				Nivo1 nivo1 = new Nivo1(scanner);
				nivo1.start();
				return;
			case "Quit":
				return;
			}
		}
	}
}
