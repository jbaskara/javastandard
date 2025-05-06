package azienda;

public abstract class Dipendente implements Stampabile {

	protected String nome;
	protected String cognome;
	protected double stipendioBase;
	private static int contatore = 0;
	
	public Dipendente(String nome, String cognome, double stipendioBase) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.stipendioBase = stipendioBase;
		contatore++;
		
	}
	
	public abstract double calcolaStipendio();
	
	public static int getContatore() {
		
		return contatore;
		
	}
	
}