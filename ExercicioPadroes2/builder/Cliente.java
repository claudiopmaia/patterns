package br.uece.ees.builder;

public class Cliente {

	public static void main(String args[]){
		Pizzaria p1 = new Pizzaria(new PizzaPepperoniBuilder());
		p1.criarPizza();
		Pizza p = p1.getPizza();
		p.mostrarDados();
	}
}
