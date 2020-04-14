package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Meni meni = new Meni(scanner);
		meni.start();
		
		scanner.close();
	}
}
