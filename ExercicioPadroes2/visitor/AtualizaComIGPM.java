package br.uece.ees.visitor;

public class AtualizaComIGPM implements AtualizadorContaVisitor {

	@Override
	public void atualiza(ContaCorrente contaCorrente) {
		contaCorrente.setSaldo(contaCorrente.getSaldo()*1.075);

	}

}
