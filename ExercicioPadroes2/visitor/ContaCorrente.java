package br.uece.ees.visitor;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, double saldo) {
		super(numero, saldo);
	}

	@Override
	public void atualiza(AtualizadorContaVisitor atualizadorConta) {
		atualizadorConta.atualiza(this);

	}

}
