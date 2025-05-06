package animale;

public class Gatto extends Animale {
	
	public Gatto(String nome) {
		
		super(nome);
		
	}
	
	@Override
	public String verso() {
		
		return nome + " miagola Miao Miao!";
		
	}
	
	@Override
	public String muoviti() {
		
		return nome + " si muove con eleganza!";
		
	}
	
}