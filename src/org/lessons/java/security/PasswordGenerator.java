package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Il tuo nome: ");
		String name = sc.nextLine();
		
		System.out.print("Il tuo cognome: ");
		String surname = sc.nextLine();
		
		System.out.print("Il tuo colore: ");
		String color = sc.nextLine();
		
		System.out.print("Il tuo età: ");
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
