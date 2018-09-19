package br.uece.ees.state;

public class Programa {

	ConexaoState con;
	
	public Programa (){
		con = new ConexaoFechada();
	}
	
	public void abrirConexar(){
		con = con.abrir();
	}
	
	public void transmitirDados(){
		con = con.transmitir();
	}
	
	public void fecharConexao(){
		con = con.fechar();
	}
	
}
