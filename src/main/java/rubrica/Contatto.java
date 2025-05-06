package rubrica;

import java.util.Objects;

public class Contatto {
	
	private String nome;
	private String numero;
	
	public Contatto(String nome, String numero) {
		
		this.nome = nome;
		this.numero = numero;
		
	}
	
	public String getNome() {
		
		return nome;
		
	}
	
	public String getNumero() {
		
		return numero;
		
	}
	
	@Override
	public String toString() {
		
		return nome + " - " + numero;
		
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (this == o) return true;
		if (!(o instanceof Contatto)) return false;
		Contatto c = (Contatto) o;
		return nome.equals(c.nome) && numero.equals(c.numero);
		
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(nome, numero);
		
	}

}
