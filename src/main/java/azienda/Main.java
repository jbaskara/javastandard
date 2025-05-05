package azienda;

public class Main {
	
	public static void main(String[] args) {
		
		Dipendente i1 = new Impiegato("Mario", "Rossi", 1500);
		Dipendente i2 = new Impiegato("Marco", "Neri", 1500);
		Dipendente i3 = new Impiegato("Anna", "Verdi", 1700);
		Dipendente m1 = new Manager("Luca", "Bianchi", 2000, 300);
		Dipendente m2 = new Manager("Rosa", "Bianchi", 2200, 500);
		
		i1.stampaDettagli();
		i2.stampaDettagli();
		i3.stampaDettagli();
		m1.stampaDettagli();
		m2.stampaDettagli();
		
		System.out.println("\nTotale Dipendenti: " + Dipendente.getContatore());
		
	}
 
}
