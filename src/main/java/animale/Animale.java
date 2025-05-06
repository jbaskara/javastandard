package animale;

public class Animale {
	
	protected String nome;

	public Animale(String nome) {
		
		this.nome = nome;
		
	}
	
	public String verso() {
		
		return nome + " fa un verso.";
		
	}
	
	public String muoviti() {
		
		return nome + " si muove.";
		
	}

    public String emettiSuono() {
    	
    	return nome + " emette suoni.";
        
    }

    public String vola() {
    	
    	return nome + " si vola.";
        
    }
	
}