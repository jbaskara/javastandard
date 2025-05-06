package azienda;

public class Manager extends Dipendente {
	
	private double bonus;
	
	public Manager(String nome, String cognome, double stipendioBase, double bonus) {
		
		super(nome, cognome, stipendioBase);
		this.bonus = bonus;
		
	}
	
	@Override
	public double calcolaStipendio() {
		
		return stipendioBase;
		
	}
	
	@Override
	public void stampaDettagli() {
		
		System.out.println("Manager: " + nome + " " + cognome + 
				"\nStipendio: " + calcolaStipendio() + 
				" (Bonus: " + bonus + ")");
		System.out.println();
		
	}

}