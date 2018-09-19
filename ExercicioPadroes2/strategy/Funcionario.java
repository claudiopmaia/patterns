package br.uece.ees.strategy;

public class Funcionario {

	private String localizacao = "RH";
	private Impressora imp;
	
	public void imprimirDocumento(String doc){
		switch (localizacao){
			case "RH": imp = new ImpressoraRH(); break;
			case "Inform�tica": imp = new ImpressoraInformatica(); break;
			case "Marketing": imp = new ImpressoraMarketing(); break;
		}
		
		imp.imprimir(doc);
	}
	
	public void setLocaliza�ao(String localizacao){
		this.localizacao = localizacao;
	}
	
}
