package br.uece.ees.state;

public class ConexaoAberta extends ConexaoState {

	@Override
	public ConexaoState abrir() {
		System.out.println("Erro! Conexão já aberta");
		return this;
	}

	@Override
	public ConexaoState transmitir() {
		System.out.println("Iniciando transmissão");
		System.out.println("Transmitindo dados...");
		return new ConexaoTransmitindo();
	}

	@Override
	public ConexaoState fechar() {
		System.out.println("Conexão fechada sem transmitir dados");
		return new ConexaoFechada();
	}

}
