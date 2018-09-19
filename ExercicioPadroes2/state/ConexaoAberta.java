package br.uece.ees.state;

public class ConexaoAberta extends ConexaoState {

	@Override
	public ConexaoState abrir() {
		System.out.println("Erro! Conex�o j� aberta");
		return this;
	}

	@Override
	public ConexaoState transmitir() {
		System.out.println("Iniciando transmiss�o");
		System.out.println("Transmitindo dados...");
		return new ConexaoTransmitindo();
	}

	@Override
	public ConexaoState fechar() {
		System.out.println("Conex�o fechada sem transmitir dados");
		return new ConexaoFechada();
	}

}
