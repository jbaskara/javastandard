package animale;

interface Volante {
	
    String vola();
    
}

public class Pipistrello extends Animale implements Volante {
	
	public Pipistrello(String nome) {
		
		super(nome);
		
	}
	
    @Override
    public String emettiSuono() {
    	
    	return nome + " emette ultrasuoni.";
        
    }

    @Override
    public String vola() {
    	
    	return nome + " vola.";
        
    }
}