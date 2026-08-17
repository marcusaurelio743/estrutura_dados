package estruturaVetor.teste;

import estruturaVetor.Vetor;

public class Aula9 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);
		vetor.adicionar("A");
		vetor.adicionar("B");
		vetor.adicionar("C");
		vetor.adicionar("D");
		vetor.adicionar("E");
		
		System.out.println(vetor);
		vetor.remove(1);
		System.out.println(vetor);

	}

}
