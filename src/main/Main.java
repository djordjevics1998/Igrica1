package main;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Hero;
import entities.NPC;
import interfaces.OnInteractionListener;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		/*ArrayList<OnInteractionListener> listeners = new ArrayList();
		listeners.add(new Hero());
		listeners.add(new NPC());*/
		
		Meni meni = new Meni(scanner);
		meni.start();
		
		scanner.close();
	}
}
