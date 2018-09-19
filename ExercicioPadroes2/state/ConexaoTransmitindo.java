package br.uece.ees.state;

public class ConexaoTransmitindo extends ConexaoState {

	@Override
	public ConexaoState abrir() {
		System.out.println("Erro! Conex�o j� aberta");
		return this;
	}

	@Override
	public ConexaoState transmitir() {
		System.out.println("Continuar transmitindo dados...");
		return this;
	}

	@Override
	public ConexaoState fechar() {
		System.out.println("Parar transmiss�o");
		System.out.println("Fechando conex�o...");
		System.out.println("Conex�o fechada");
		return new ConexaoFechada();
	}

}
