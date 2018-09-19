package br.uece.ees.abstractfactory;

public class Smartphone extends Portatil {

	public Smartphone(String marca, double preco) {
		super(marca, preco);
		
	}

	@Override
	public void carregar() {
		System.out.println("Carregando smartphone " + marca);

	}

}
