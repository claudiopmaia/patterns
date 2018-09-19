package br.uece.ees.abstractfactory;

public class Desktop extends Computador {

	public Desktop(String marca) {
		super(marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ligar() {
		System.out.println("Ligando desktop " + marca);

	}

	@Override
	public void desligar() {
		System.out.println("Desligando desktop" + marca);

	}

}
