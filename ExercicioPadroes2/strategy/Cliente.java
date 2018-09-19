package br.uece.ees.strategy;

public class Cliente {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		String doc = "Documento para imprimir...";
		f.imprimirDocumento(doc);
		
		f.setLocalizaçao("Marketing");
		f.imprimirDocumento(doc);
		
		f.setLocalizaçao("Informática");
		f.imprimirDocumento(doc);

	}

}
