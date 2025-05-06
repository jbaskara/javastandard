package classe;

public class Main {
	
	public static void main(String[] args) {
		
		Docente docente1 = new Docente("Graziano", "Tocci");
		Docente docente2 = new Docente("Davide", "Galiano");
		ClasseScolastica classe1 = new ClasseScolastica(docente1, 24);
		ClasseScolastica classe2 = new ClasseScolastica(docente2, 20);
		
		classe1.visualizzaClasse();
		System.out.println();
		classe2.visualizzaClasse();
		
	}

}
