package br.uece.ees.builder;

public class Pizzaria {

	private PizzaBuilder pizzaiolo;
	
	public Pizzaria(PizzaBuilder pizzaiolo){
		this.pizzaiolo=pizzaiolo;
	}
	
	public void criarPizza(){
		pizzaiolo.comporIngredientes();
		pizzaiolo.assar();
		pizzaiolo.cortar();
	}
	
	public Pizza getPizza(){
		return pizzaiolo.getPizza();
	}
}
