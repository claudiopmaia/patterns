package br.uece.ees.strategy;

public class Cliente {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		String doc = "Documento para imprimir...";
		f.imprimirDocumento(doc);
		
		f.setLocaliza�ao("Marketing");
		f.imprimirDocumento(doc);
		
		f.setLocaliza�ao("Inform�tica");
		f.imprimirDocumento(doc);

	}

}
