package br.uece.ees.strategy;

public class ImpressoraMarketing extends Impressora {

	public ImpressoraMarketing(){
		dados = "Marketing - Samsung";
	}
	
	@Override
	public void imprimir(String doc) {
		System.out.println("Imprimindo documento em " + dados);
		System.out.println("++++++++");
		System.out.println(doc);
		System.out.println("++++++++");

	}

}
