package estruturaVetor.teste;

import estruturaVetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		Lista<Long> lista = new Lista<>(4);
		lista.adicionar(5L);
		lista.adicionar(7L);
		lista.adicionar(16L);
		lista.adicionar(45L);
		lista.adicionar(45L);
		lista.adicionar(45L);
		
		System.out.println(lista);
		System.out.println("Tamanho total: "+lista.getTamanho());

	}

}
