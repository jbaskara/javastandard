package animale;

public class Animale {
	
	protected String nome;

	public Animale(String nome) {
		
		this.nome = nome;
		
	}
	
	public String verso() {
		
		return "Questo animale fa un verso.";
		
	}
	
	public String muoviti() {
		
		return "Il " + nome + " si muove.";
		
	}
	
}