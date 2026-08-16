package estruturaVetor.teste;

import estruturaVetor.Vetor;

public class Aula5 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		vetor.adicionar("Marcus");
		vetor.adicionar("Maria");
		vetor.adicionar("Jose");
		vetor.adicionar("Paulo");
		
		
		System.out.println(vetor.busca(90));
	}

}
