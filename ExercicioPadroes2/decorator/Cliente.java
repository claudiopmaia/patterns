package br.uece.ees.decorator;

public class Cliente {

	public static void main(String args[]){
		
		Coquetel c = new Vodka();
		System.out.println("Descri��o: " + c.getNome());
		System.out.println("Pre�o: R$" + c.getPreco());
		
		c = new CoquetelComGelo(c);
		//c = new CoquetelComLimao(c);
		
		System.out.println("Descri��o: " + c.getNome());
		System.out.println("Pre�o: R$" + c.getPreco());
		
		System.out.println(" =======================");
		
		c = new Run();
		System.out.println("Descri��o: " + c.getNome());
		System.out.println("Pre�o: R$" + c.getPreco());
		
		c = new CoquetelComRefri(c);
		c = new CoquetelComLimao(c);
		
		System.out.println("Descri��o: " + c.getNome());
		System.out.println("Pre�o: R$" + c.getPreco());
	}
}
