package estruturaVetor;

public class VetorObject {
	private Object[] elementos;
	private int tamanho;
	
	public VetorObject(int capacidade) {
		this.elementos = new Object[capacidade];
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
	
	public boolean adicionar(Object elemento) {
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
	public boolean adicionar(Object elemento,int posicao) {
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
	
	public void remove(int posicao) {
		if( !(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Invalida!!");
		}
		
		for(int i= posicao; i < tamanho -1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public Object busca(int posicao) {
		if( !(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Invalida!!");
		}
		return this.elementos[posicao];
	}
	
	public int busca(Object elemento) {
		for(int i=0; i < getTamanho(); i++) {
			if(elementos[i].equals(elemento)) {
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
			Object[] novoVetor = new Object[tamanho * 2];
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
			s.append(", ");
		}
		s.append("]");
		return  s.toString() ;
	}
	
	
	
	

}
