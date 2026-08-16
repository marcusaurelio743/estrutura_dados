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
		if( tamanho < elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}else {
			return false;
		}
	}
	
	public int getTamanho() {
		return this.tamanho;
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
