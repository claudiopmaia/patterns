package br.uece.ees.abstractfactory;

public abstract class Computador {

	protected String marca;
	
	public Computador (String marca){
		this.marca = marca;
	}
	
	public abstract void ligar();
	public abstract void desligar();
}
