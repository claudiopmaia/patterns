package br.uece.ees.decorator;

public class Vodka extends Coquetel{

	public Vodka(){
		nome = "vodka";
		//preco = 2.1;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public double getPreco() {
		return 3.5;
	}
}
