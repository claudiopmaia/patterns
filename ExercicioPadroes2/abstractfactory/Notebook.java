package br.uece.ees.abstractfactory;

public class Notebook extends Computador {

	public Notebook(String marca){
		super(marca);
	}
	@Override
	public void ligar() {
		System.out.println("iniciando boot notebook " + marca);
		System.out.println("sistema iniciado");
	}

	@Override
	public void desligar() {
		System.out.println("desligando notebook" + marca);
		System.out.println("Bye bye");

	}

}
