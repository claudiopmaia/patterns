package br.uece.ees.templatemethod;

public class RelatorioDesktop extends RelatorioTemplate {

	@Override
	public void inserirCabecalho() {
		System.out.println("<html>");
		System.out.println("<header><title>Relatorio teste </header></title>");
		
	}

	@Override
	public void inserirConteudo() {
		System.out.println("<body>");
		System.out.println("<p>Conte�do 1</p>");
		System.out.println("<p>Conte�do 2</p>");
		System.out.println("<p>Conte�do 3</p>");
		System.out.println("</body>");

	}

	@Override
	public void inserirRodape() {
		System.out.println("</html>");

	}

}
