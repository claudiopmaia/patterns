package br.uece.ees.chain;

public class CentroCiencias extends CentroChain {

	public CentroCiencias() {
		super();
		nome = "Centro de Ciências";
	}

	@Override
	public void confirmar(String doc) {
		System.out.println(nome + " confirma recebimento do documento " + doc);
		System.out.println("Prof. Fulano - Diretor do " + nome);

	}

}
