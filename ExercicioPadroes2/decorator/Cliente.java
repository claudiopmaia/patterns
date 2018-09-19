package br.uece.ees.decorator;

public class Cliente {

	public static void main(String args[]){
		
		Coquetel c = new Vodka();
		System.out.println("Descrição: " + c.getNome());
		System.out.println("Preço: R$" + c.getPreco());
		
		c = new CoquetelComGelo(c);
		//c = new CoquetelComLimao(c);
		
		System.out.println("Descrição: " + c.getNome());
		System.out.println("Preço: R$" + c.getPreco());
		
		System.out.println(" =======================");
		
		c = new Run();
		System.out.println("Descrição: " + c.getNome());
		System.out.println("Preço: R$" + c.getPreco());
		
		c = new CoquetelComRefri(c);
		c = new CoquetelComLimao(c);
		
		System.out.println("Descrição: " + c.getNome());
		System.out.println("Preço: R$" + c.getPreco());
	}
}
