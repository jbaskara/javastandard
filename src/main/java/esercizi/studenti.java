package esercizi;

import java.util.*;

public class studenti {
	
	public static void main(String[] args) {
		
		Map<String, Integer> votiStudenti = new HashMap<>();
		
		votiStudenti.put("Alice", 28);
		votiStudenti.put("Marco", 24);
		votiStudenti.put("Giulia", 30);
		
		System.out.println("Voti degli studenti: ");
		
		for (String nome : votiStudenti.keySet()) {
			
			System.out.println(nome + ": " + votiStudenti.get(nome));
			
		}

		votiStudenti.put("Marco", 26);
		System.out.println("\nIl nuovo voto di Marco è: 26");
		
		String studenteCercato = "Giulia";
		
		if (votiStudenti.containsKey(studenteCercato)) {
			
			System.out.println("\nIl voto di " + studenteCercato + " è: " 
			+ votiStudenti.get(studenteCercato));
			
		} else {
			
			System.out.println("\nStudente non trovato.");
			
		}
		
		System.out.println("\nNomi degli studenti: \n" + votiStudenti.keySet());
		
		System.out.println("\nVoti degli studenti: \n" + votiStudenti.values());
		
		System.out.println("\nCoppie nome-voto: ");
		
		for (Map.Entry<String, Integer> entry : votiStudenti.entrySet()) {
			
			System.out.println(entry.getKey() + " -> " + entry.getValue());
			
		}
		
	}

}
