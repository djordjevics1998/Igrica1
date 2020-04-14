package nivoi;

import java.util.Random;
import java.util.Scanner;

import main.Meni;

public class Nivo1 {
	private Scanner scanner;
	
	public Nivo1(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void start() {
		Random rand = new Random(); 
		  
        // Generate random integers in range 0 to 999 
        int id = rand.nextInt(1000); 
        System.out.println("почетак петље" + id);
		String str;
		while(true) {
			System.out.println("Nivo1: Meni");
			str = scanner.nextLine();
			switch(str) {
			case "Meni":
				Meni meni = new Meni(scanner);
				meni.start();
				System.out.println("крај петље" + id);
				return;
			}
		}
	}
}
