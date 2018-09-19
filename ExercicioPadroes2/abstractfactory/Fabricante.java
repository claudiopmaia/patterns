package br.uece.ees.abstractfactory;

public abstract class Fabricante {

	protected String nome;

	public Fabricante(String nome){
		this.nome = nome;
	}
	
	public abstract Computador getComputador(String tipo);
	public abstract Portatil getPortatil(String tipo);

	
	
}
