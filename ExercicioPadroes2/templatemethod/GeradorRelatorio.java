package br.uece.ees.templatemethod;

public class GeradorRelatorio {

	RelatorioTemplate rel;
	String tipoRelatorio;
	
	public void criarRelatorio(){
		rel.gerarRelatorio();
	}
	
	public void setTipoRelatorio(String tipo){
		switch(tipo){
			case "Android": rel =  new RelatorioAndroid(); break;
			case "Desktop": rel = new RelatorioDesktop(); break;
		}
	}
		
}
