package br.uece.ees.abstractfactory;

public class Cliente {

	public static void main(String args[]){
		Fabricante fab = new LG("LG");
		Computador c = fab.getComputador("notebook");
		c.ligar();
		c.desligar();
		
		Portatil p = fab.getPortatil("smartphone");
		p.carregar();
	
	}
}
