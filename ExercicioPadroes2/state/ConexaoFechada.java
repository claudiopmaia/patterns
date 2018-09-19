package br.uece.ees.state;

public class ConexaoFechada extends ConexaoState {

	@Override
	public ConexaoState abrir() {
		System.out.println("Abrindo conex�o...");
		System.out.println("Conex�o aberta");
		return new ConexaoAberta();
	}

	@Override
	public ConexaoState transmitir() {
		System.out.println("Erro! Conex�o fechada");
		return this;
	}

	@Override
	public ConexaoState fechar() {
		System.out.println("Erro! Conex�o j� fechada");
		return this;
	}

}
