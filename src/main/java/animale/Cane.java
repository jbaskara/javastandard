package animale;

public class Cane extends Animale {
	
	public Cane(String nome) {
		
		super(nome);
		
	}
	
	@Override
	public String verso() {
		
		return nome + " abbaia Bau Bau!";
		
	}
	
	@Override
	public String muoviti() {
		
		return nome + " corre felice!";
		
	}
	
}