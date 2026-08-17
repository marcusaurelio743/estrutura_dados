package estruturaVetor;

import java.util.Arrays;

public class Vetor {
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	/*public void adicionar(String elemento) {
		for(int i=0; i < elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	public boolean adicionar(String elemento) {
		aumentaCapacidade();
		if( tamanho < elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}else {
			return false;
		}
	}
	/* 0 1 2 3
	 * B C T Y A 0
	 * Y-> 4
	 * t->3
	 * c->2
	 * b->1
	 * a->0 
	 * */
	public boolean adicionar(String elemento,int posicao) {
		aumentaCapacidade();
		if( !(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Invalida!!");
		}
		
		for(int i= tamanho -1; i>= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		tamanho++;
		
		return false;
	}
	
	public String busca(int posicao) {
		if( !(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Invalida!!");
		}
		return this.elementos[posicao];
	}
	
	public int busca(String elemento) {
		for(int i=0; i < getTamanho(); i++) {
			if(elementos[i].equalsIgnoreCase(elemento)) {
				System.out.println(elementos[i]);
				return i;
				
			}
		}
		return -1;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public void aumentaCapacidade() {
		if(tamanho == elementos.length) {
			String[] novoVetor = new String[tamanho * 2];
			for(int i = 0; i < tamanho; i++) {
				novoVetor[i] = elementos[i]; 
			}
			elementos= novoVetor;
		}
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i=0; i < getTamanho(); i++) {
			s.append(elementos[i]);
			s.append(" ");
		}
		s.append("]");
		return  s.toString() ;
	}
	
	
	
	

}
