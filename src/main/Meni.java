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
		 Random rand = new Random(); 
		  
	        // Generate random integers in range 0 to 999 
	        int id = rand.nextInt(1000); 
	        System.out.println("почетак петље" + id);
		String str;
		while(true) {
			System.out.println("Meni: New game, Quit");
			str = scanner.nextLine();
			switch(str) {
			case "New game":
				Nivo1 nivo1 = new Nivo1(scanner);
				nivo1.start();
				System.out.println("крај петље" + id);
				return;
			case "Quit":
				System.out.println("крај петље" + id);
				return;
			}
		}
	}
}
