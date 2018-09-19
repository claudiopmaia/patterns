package br.uece.ees.state;

public abstract class ConexaoState {

	public  abstract ConexaoState abrir();
	public  abstract ConexaoState transmitir();
	public  abstract ConexaoState fechar();
	
	
}
