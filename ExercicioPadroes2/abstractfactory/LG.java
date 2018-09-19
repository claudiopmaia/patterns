package br.uece.ees.abstractfactory;

public class LG extends Fabricante {

	public LG(String nome) {
		super(nome);
	}

	@Override
	public Computador getComputador(String tipo) {
		Computador c = null;
		switch (tipo){
			case "notebook": c = new Notebook("LG Notebook XYZ"); break;
			case "desktop": c = new Desktop("LG Desktop ABC"); break;
		}
		return c;
	}

	@Override
	public Portatil getPortatil(String tipo) {
		Portatil p= null;
		switch (tipo){
			case "smartphone": p = new Smartphone("LG Smartphone com Android", 1.200); break;
			case "tablet": p = new Tablet("LG Tablet 10 polegadas", 890); break;
		}
		return p;
	}


}
