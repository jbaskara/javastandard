package esercizi;

import java.util.HashSet;
import java.util.Set;

public class libri2 {
	
	public static void main(String[] args) {
		
		Set<String> libri = new HashSet<>();
		
		// add(element) - aggiunge un elemento
		libri.add("Il Signore degli Anelli");
		libri.add("1984");
		libri.add("Il Piccolo Principe");
		System.out.println("Lista libri: " + libri);
		System.out.println();
		
		// add(index, element) - inserisce a una certa posizione
		libri.add("Harry Potter");
		System.out.println("Libro Harry Potter aggiunto.");
		System.out.println("Lista libri: " + libri);
		System.out.println();
		
		libri.remove("Harry Potter");
		System.out.println("Libro Harry Potter rimosso.");
		System.out.println();
		
		
		// contains(obj) - verifica se esiste
		if(libri.contains("Il Signore degli Anelli")) {
			
			System.out.println("Il Signore degli Anelli è nella lista libri");
			System.out.println();
			
		}
		
		// size() - numero di elementi
		System.out.println("Numero di libri: " + libri.size());
		System.out.println("Lista finale: " + libri);
		
	}

}
