package br.uece.ees.builder;

public class PizzaPepperoniBuilder extends PizzaBuilder {

	@Override
	public void comporIngredientes() {
		System.out.println("Adicione uma camada de queijo e outra de molho de tomate");
		System.out.println("Adicione várias rodelas de peperone");
		System.out.println("Adicione azeitonas");
		pizza.addIngrediente("quejo");
		pizza.addIngrediente("molho de tomate");
		pizza.addIngrediente("pepperone");
		pizza.addIngrediente("azeitona");
	}

	@Override
	public void assar() {
		System.out.println("Leve ao forno por 25 minutos");

	}

	@Override
	public void cortar() {
		System.out.println("Corte em 12 pedaços");
		pizza.setPreco(39.90);
	}

}
