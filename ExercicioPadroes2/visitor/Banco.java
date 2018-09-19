package br.uece.ees.visitor;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Conta> contas = new ArrayList<Conta>();

	public Banco(){
		contas.add(new ContaCorrente(123, 500));
		contas.add(new ContaCorrente(456, 800));
		contas.add(new ContaCorrente(789, 1000));
	}
	
	public void atualizando(AtualizadorContaVisitor atualizadorConta){
		for (Conta conta: contas) {
			conta.atualiza(atualizadorConta);
		}
	}
	
	public void mostrarDados(){
		for (Conta conta: contas){
			conta.mostrarDados();
		}
		System.out.println("======================");
	}
}
