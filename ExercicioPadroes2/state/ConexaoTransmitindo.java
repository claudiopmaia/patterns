package br.uece.ees.state;

public class ConexaoTransmitindo extends ConexaoState {

	@Override
	public ConexaoState abrir() {
		System.out.println("Erro! Conexão já aberta");
		return this;
	}

	@Override
	public ConexaoState transmitir() {
		System.out.println("Continuar transmitindo dados...");
		return this;
	}

	@Override
	public ConexaoState fechar() {
		System.out.println("Parar transmissão");
		System.out.println("Fechando conexão...");
		System.out.println("Conexão fechada");
		return new ConexaoFechada();
	}

}
