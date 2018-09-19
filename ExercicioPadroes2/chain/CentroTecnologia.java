package br.uece.ees.chain;

public class CentroTecnologia extends CentroChain {

	public CentroTecnologia() {
		super();
		nome = "Centro de Tecnologia";
	}

	@Override
	public void confirmar(String doc) {
		System.out.println(nome + " confirma recebimento do documento " + doc);
		System.out.println("Prof. Beltrano - Diretor do Centro " + nome);

	}

}
