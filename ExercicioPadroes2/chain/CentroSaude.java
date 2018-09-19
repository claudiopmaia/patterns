package br.uece.ees.chain;

public class CentroSaude extends CentroChain {

	public CentroSaude() {
		super();
		nome = "Centro de Sa�de";
	}

	@Override
	public void confirmar(String doc) {
		System.out.println(nome + " confirma recebimento do documento " + doc);
		System.out.println("Prof. Cicrano - Diretor do " + nome);

	}

}
