package azienda;

public class Impiegato extends Dipendente {
	
	public Impiegato(String nome, String cognome, double stipendioBase) {
		
		super(nome, cognome, stipendioBase);
		
	}
	
	@Override
	public double calcolaStipendio() {
		
		return stipendioBase;
		
	}
	
	@Override
	public void stampaDettagli() {
		
		System.out.println("Impiegato: " + nome + " " + cognome + 
				"\nStipendio: " + calcolaStipendio());
		System.out.println();
		
	}

}
