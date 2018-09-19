package br.uece.ees.decorator;

public class CoquetelDecorator extends Coquetel {

	private Coquetel meuCoquetel;
	
	public CoquetelDecorator(Coquetel meuCoquetel){
		this.meuCoquetel = meuCoquetel;
	}
	
	public String getNome() {
		return meuCoquetel.getNome();
	}
	public double getPreco() {
		return meuCoquetel.getPreco();
	} 
}
