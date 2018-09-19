package br.uece.ees.abstractfactory;

public class Tablet extends Portatil {

	public Tablet(String marca, double preco){
		super(marca, preco);
	}
	
	@Override
	public void carregar() {
		System.out.println("Carregando tablet " + marca);
	}


}
