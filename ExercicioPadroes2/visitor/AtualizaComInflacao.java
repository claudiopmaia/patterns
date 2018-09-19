package br.uece.ees.visitor;

public class AtualizaComInflacao implements AtualizadorContaVisitor {

	@Override
	public void atualiza(ContaCorrente contaCorrente) {
		contaCorrente.setSaldo(contaCorrente.getSaldo()*1.05);
	}

}
