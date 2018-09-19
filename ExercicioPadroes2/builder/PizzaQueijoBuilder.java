package br.uece.ees.builder;

public class PizzaQueijoBuilder extends PizzaBuilder {

	@Override
	public void comporIngredientes() {
		System.out.println("Adicione três camadas de queijo, molho de tomate e orégano");
		pizza.addIngrediente("quejo");
		pizza.addIngrediente("molho de tomate");
		pizza.addIngrediente("orégano");
	}

	@Override
	public void assar() {
		System.out.println("Leve ao forno por 15 minutos");

	}

	@Override
	public void cortar() {
		System.out.println("Corte a pizza em 8 pedaços");
		pizza.setPreco(29.90);
	}

}
