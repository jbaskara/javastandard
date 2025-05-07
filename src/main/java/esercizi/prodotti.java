package esercizi;

import java.util.*;

public class prodotti {
	
	public static void stampaProdotti(Map<String, Double> mappa) {
		
		for (Map.Entry<String, Double> entry : mappa.entrySet()) {
			
			System.out.printf(entry.getKey() + ": €" + entry.getValue());
			System.out.println();
			
		}
		
	}
	
	public static <K, V extends Number> 
	void stampaFiltrati(List<Map.Entry<K, V>> lista, double soglia) {
		
		for (Map.Entry<K, V> entry : lista) {
			
			if (entry.getValue().doubleValue() > soglia) {
				
				System.out.printf(entry.getKey() + ": €" + entry.getValue());
				System.out.println();
				
			}
			
		}
		
	}
	
	public static double calcolaMedia(Map<String, Double> mappa) {
		
		double somma = 0.0;
		
		for (double prezzo : mappa.values()) {
			
			somma += prezzo;
			
		}
		
		return somma / mappa.size();
		
	}
	
	public static void main(String[] args) {
		
		Map<String, Double> prodotti = new HashMap<>();
		
		prodotti.put("Pane", 1.50);
		prodotti.put("Pasta", 1.20);
		prodotti.put("Formaggio", 3.00);
		prodotti.put("Sugo", 1.70);
		prodotti.put("Sale", 1.00);
		
		System.out.println("Tutti i prodotti: ");
		stampaProdotti(prodotti);
		
		List<Map.Entry<String, Double>> listaProdotti = 
				new ArrayList<>(prodotti.entrySet());
		
		double soglia = 2.00;
		
		System.out.println("\nProdotti con prezzo sopra €" + soglia + ":");
		stampaFiltrati(listaProdotti, soglia);
	
		double media = calcolaMedia(prodotti);
		System.out.printf("\nPrezzo medio: €%.2f", media);
		
	}

}
