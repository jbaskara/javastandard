package animale;

public class Main {
	
	public static void main(String[] args) {
		
		Animale cane = new Cane("Spike");
		Animale gatto = new Gatto("Tom");
		Animale pipistrello = new Pipistrello("Bats");
		
		System.out.println(cane.verso());
		System.out.println(cane.muoviti());
		System.out.println();
		System.out.println(gatto.verso());
		System.out.println(gatto.muoviti());
		System.out.println();
		System.out.println(pipistrello.emettiSuono());
		System.out.println(pipistrello.vola());
		
	}
	
}
	
