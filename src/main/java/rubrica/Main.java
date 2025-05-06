package rubrica;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		Set<Contatto> rubrica = new HashSet<>();
		
		rubrica.add(new Contatto("Anna", "333-1234567"));
		rubrica.add(new Contatto("Luca", "345-7654321"));
		rubrica.add(new Contatto("Rosa", "320-9871235"));
		
		System.out.println("Contatti nella rubrica: ");
		for (Contatto c : rubrica) {
			
			System.out.println(c);
			
		}
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nInserisci il numero da cercare: ");
		String numeroCercato = input.nextLine();
		
		boolean trovato = false;
		
		for (Contatto c : rubrica) {
			
			if (c.getNumero().equals(numeroCercato)) {
				
				System.out.println("\nContatto trovato: " + c);
				trovato = true;
				
			}
			
		}
		
		if(!trovato) {
			
			System.out.println("\nContatto non trovato.");
			
		}
		
		input.close();
		
	}

}
