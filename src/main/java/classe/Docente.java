package classe;

public class Docente extends Persona {
	
	public Docente(String nome, String cognome) {
		
		super(nome, cognome);
		
	}
	
	public void visualizzaInfo() {
		
		System.out.println("Docente: " + nome + " " + cognome);
		
	}

}
