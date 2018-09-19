package br.uece.ees.visitor;

public class Cliente {

	public static void main(String[] args) {

		Banco banco = new Banco();
		banco.mostrarDados();
		banco.atualizando(new AtualizaComInflacao());
		banco.mostrarDados();
		banco.atualizando(new AtualizaComIGPM());
		banco.mostrarDados();

	}

}
