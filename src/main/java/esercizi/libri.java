package esercizi;

import java.util.ArrayList;
import java.util.List;

public class libri {
	
	public static void main(String[] args) {
		
		List<String> libri = new ArrayList<>();
		
		libri.add("Il Signore degli Anelli");
		libri.add("1984");
		libri.add("Il Piccolo Principe");
		
		System.out.println("Lista libri: " + libri);
		System.out.println();
		
		libri.add(1, "Harry Potter");
		System.out.println("Libro Harry Potter aggiunto.");
		System.out.println("Lista libri: " + libri);
		System.out.println();
		
		System.out.println("Libro in posizione 2: " + libri.get(2));
		libri.set(2, "Titanic");
		System.out.println("Libro 1984 sostituito con Titanic");
		System.out.println();
		
		libri.remove(0);
		libri.remove("Harry Potter");
		System.out.println("Libro Il Signore degli Anelli rimosso.");
		System.out.println("Libro Harry Potter rimosso.");
		System.out.println();
		
		if(libri.contains("Il Piccolo Principe")) {
			
			System.out.println("Il Piccolo Principe è nella lista libri");
			System.out.println();
			
		}
		
		System.out.println("Numero di libri: " + libri.size());
		System.out.println("Lista finale: " + libri);
		
	}

}
