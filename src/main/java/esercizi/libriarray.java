package esercizi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class libriarray {
	
	public static void main(String[] args) {
		
		List<String> libri = new ArrayList<>();
		
		// add(element) - aggiunge un elemento
		libri.add("Il Signore degli Anelli");
		libri.add("1984");
		libri.add("Il Piccolo Principe");
		System.out.println("Lista libri: " + libri);
		
		// sort() - ordina la lista
		Collections.sort(libri);
		System.out.println("Lista ordinata: " + libri);
		System.out.println();
		
		// add(index, element) - inserisce a una certa posizione
		libri.add(1, "Harry Potter");
		System.out.println("Libro Harry Potter aggiunto.");
		System.out.println("Lista libri: " + libri);
		System.out.println();
		
		// get(index) - prende un elemento
		System.out.println("Libro in posizione 2: " + libri.get(2));
		
		// set(index, element) - modifica un elemento
		libri.set(2, "Titanic");
		System.out.println("Libro Il Piccolo Principe sostituito con Titanic");
		System.out.println("Lista libri: " + libri);
		System.out.println();
		
		// remove(index/obj) - rimuove un elemento
		libri.remove(0);
		libri.remove("Harry Potter");
		System.out.println("Libro 1984 rimosso.");
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
		
		// reverse() - inverte la lista
		Collections.reverse(libri);
		System.out.println("Lista invertita: " + libri);
		
	}

}
