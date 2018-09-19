package br.uece.ees.templatemethod;

public class RelatorioAndroid extends RelatorioTemplate {

	@Override
	public void inserirCabecalho() {
		System.out.println("<xml version=1.0>");
		System.out.println("<init>Relatório Teste</int>");

	}

	@Override
	public void inserirConteudo() {
		System.out.println("<content>Conteudo 1 </content>");
		System.out.println("<content>Conteudo 2 </content>");
		System.out.println("<content>Conteudo 3 </content>");
	}

	@Override
	public void inserirRodape() {
		System.out.println("<footnote> 2014 CopyRight - All rights reserved </footnote>");

	}

}
