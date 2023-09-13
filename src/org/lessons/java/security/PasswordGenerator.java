package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Il tuo nome: ");
		while (sc.hasNextInt()) {
            System.out.print("Inserisci un valore alfabetico. Il tuo nome: ");
            sc.next();
        }
		String name = sc.nextLine();
		
		
		
		System.out.print("Il tuo cognome: ");
		while (sc.hasNextInt()) {
            System.out.print("Inserisci un valore alfabetico. Il tuo cognome: ");
            sc.next();
        }
		String surname = sc.nextLine();
		
		
		
		System.out.print("Il tuo colore: ");
		while (sc.hasNextInt()) {
            System.out.print("Inserisci un valore alfabetico. Il tuo colore: ");
            sc.next();
        }
		String color = sc.nextLine();
		
		
		
		System.out.print("La tua età: ");
		while (sc.hasNextInt()) {
            System.out.print("Inserisci un valore corretto. La tua età: ");
            sc.next();
        }
		String age = sc.nextLine();
		
		
		String ageFormatting = "";
		
		for(int i = 0; i < age.length(); i++) {
			if(i >= age.length() - 4) {
				ageFormatting += age.charAt(i);
			}
		}
		
		sc.close();
		
		System.out.println(name + "-" + surname + "-" + color + "-" + ageFormatting);

	}

}
