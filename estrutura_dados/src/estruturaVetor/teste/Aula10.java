package estruturaVetor.teste;

import estruturaVetor.VetorObject;

public class Aula10 {

	public static void main(String[] args) {
		VetorObject object = new VetorObject(4);
		object.adicionar("Maria");
		object.adicionar(8);
		object.adicionar(9.7);
		object.adicionar(9L);
		System.out.println("Tamanho: "+object.getTamanho());
		System.out.println(object);

	}

}
