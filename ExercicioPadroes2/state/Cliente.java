package br.uece.ees.state;

public class Cliente {

	public static void main(String[] args) {
		Programa p = new Programa();
		p.abrirConexar();
		p.transmitirDados();
		p.transmitirDados();
		p.transmitirDados();
		p.fecharConexao();
		p.transmitirDados();
		p.fecharConexao();
		p.abrirConexar();
		p.fecharConexao();

	}

}
