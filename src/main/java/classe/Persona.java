package classe;

abstract class Persona {
	
	protected String nome;
	protected String cognome;
	
	public Persona(String nome, String cognome) {
		
		this.nome = nome;
		this.cognome = cognome;
		
	}
	
	public abstract void visualizzaInfo();

}
