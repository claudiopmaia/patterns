package br.uece.ees.templatemethod;

public class Cliente {

	public static void main(String args[]){
		GeradorRelatorio g = new GeradorRelatorio();
		g.setTipoRelatorio("Android");
		g.criarRelatorio();
		
		System.out.println("  ");
		g.setTipoRelatorio("Desktop");
		g.criarRelatorio();
		
	}
}
