package br.uece.ees.templatemethod;

public abstract class RelatorioTemplate {

	public void gerarRelatorio(){
		inserirCabecalho();
		inserirConteudo();
		inserirRodape();
	}
	
	public abstract void inserirCabecalho();
	public abstract void inserirConteudo();
	public abstract void inserirRodape();
}
