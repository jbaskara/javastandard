package esercizi;

import java.util.Scanner;

public class numero {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		String numero = input.nextLine();
		
		int intero = Integer.parseInt(numero);
		
		int raddoppio = intero * 2;
		
		String risultato = Integer.toString(raddoppio);
		
		System.out.println("\nRisultato (in String raddoppiato): " + risultato);
		
	}

}
