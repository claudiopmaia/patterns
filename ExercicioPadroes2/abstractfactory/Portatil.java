package br.uece.ees.abstractfactory;

public abstract class Portatil {

	protected double preco;
	protected String marca;
	
	public Portatil (String marca, double preco){
		this.marca = marca;
		this.preco = preco;
	}
	
	public abstract void carregar();
}
