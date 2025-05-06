package esercizi;

public class calcolatrice {
	
	public static int somma(int a, int b) {
		
		return a + b;
		
	}
	
	public static int moltiplicazione(int a, int b) {
		
		return a * b;
		
	}
	
	public static void main(String[] args) {
		
		int sum = calcolatrice.somma(5,5);
		int mul = calcolatrice.moltiplicazione(5,5);
		
		System.out.println("Somma: " + sum);
		System.out.println("Moltiplicazione: " + mul);
		
	}

}
