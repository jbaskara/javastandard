package classe;

public class ClasseScolastica {
	
	private Docente docente;
	private int numeroAlunni;
	
	public ClasseScolastica(Docente docente, int numeroAlunni) {
		
		this.docente = docente;
		this.numeroAlunni = numeroAlunni;
		
	}
	
	public void visualizzaClasse() {
		
		docente.visualizzaInfo();
		System.out.println("Numero di alunni: " + numeroAlunni);
		
	}

}
