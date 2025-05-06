package esercizi;

public class persona {
	
	private String nome;
	private String cognome;
	private int eta;
	private static int contatore = 0;
	
	public persona(String nome, String cognome, int eta) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		contatore++;
		
	}
	
	public void stampaDettagli() {
		
		System.out.println("Nome: " + nome + "\nCognome: " + cognome + "\nEtà: " + eta);
		System.out.println();
		
	}
	
	public static int getContatore() {
		
		return contatore;
		
	}
	
	public static void main(String[] args) {
		
		persona p1 = new persona("Mario", "Rossi", 25);
		persona p2 = new persona("Luca", "Bianchi", 23);
		persona p3 = new persona("Giulia", "Verdi", 21);
		persona p4 = new persona("Marco", "Gialli", 27);
		persona p5 = new persona("Rosa", "Bianchi", 22);
		
		p1.stampaDettagli();
		p2.stampaDettagli();
		p3.stampaDettagli();
		p4.stampaDettagli();
		p5.stampaDettagli();
		
		System.out.println("Totale Persone: " + persona.getContatore());
		
	}

}
