package br.uece.ees.state;

public class ConexaoFechada extends ConexaoState {

	@Override
	public ConexaoState abrir() {
		System.out.println("Abrindo conexão...");
		System.out.println("Conexão aberta");
		return new ConexaoAberta();
	}

	@Override
	public ConexaoState transmitir() {
		System.out.println("Erro! Conexão fechada");
		return this;
	}

	@Override
	public ConexaoState fechar() {
		System.out.println("Erro! Conexão já fechada");
		return this;
	}

}
