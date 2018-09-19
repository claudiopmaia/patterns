package br.uece.ees.strategy;

public class ImpressoraInformatica extends Impressora {

	public ImpressoraInformatica(){
		dados = "Informática - Epson";
	}
	
	@Override
	public void imprimir(String doc) {
		System.out.println("Imprimindo documento em " + dados);
		System.out.println("............");
		System.out.println(doc);
		System.out.println(".............");

	}

}
