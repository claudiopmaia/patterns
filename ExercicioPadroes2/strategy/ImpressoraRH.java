package br.uece.ees.strategy;

public class ImpressoraRH extends Impressora {

	public ImpressoraRH(){
		dados = "Impressora RH - HP Deskjet";
	}
	
	@Override
	public void imprimir(String doc) {
		System.out.println("Imprimindo em " + dados);
		System.out.println("**********");
		System.out.println(doc);
		System.out.println("**********");
		
	}

}
