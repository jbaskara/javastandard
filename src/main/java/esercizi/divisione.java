package esercizi;

import java.util.Scanner;

public class divisione {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		try {
				
			System.out.print("Inserisci il primo numero intero: ");
			int num1 = Integer.parseInt(input.nextLine());
				
			System.out.print("Inserisci il secondo numero intero: ");
			int num2 = Integer.parseInt(input.nextLine());
				
			int risultato = num1 / num2;
			
			if (num1 < 0 || num2 < 0) {
				
				throw new IllegalArgumentException("\nI numeri non devono essere negativi.");
				
			}
				
			System.out.println("\n" + num1 + " / " + num2 + " = " + risultato);
				
		} catch (ArithmeticException e) {
				
			System.out.println("\nImpossibile dividere per zero.");
				
		} catch (NumberFormatException e) {
				
			System.out.println("\nI numeri devono essere interi.");
				
		} catch (IllegalArgumentException e) {
			
			System.out.println(e.getMessage());
			
		}
			
		input.close();
		
	}

}
