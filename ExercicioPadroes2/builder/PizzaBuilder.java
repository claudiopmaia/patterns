package br.uece.ees.builder;

public abstract class PizzaBuilder {

	protected Pizza pizza;
	
	public PizzaBuilder(){
		pizza = new Pizza();
	}
	
	public Pizza getPizza(){
		return pizza;
	}
	
	public abstract void comporIngredientes();
	
	public abstract void assar();
	
	public abstract void cortar();
}
