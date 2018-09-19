package br.uece.ees.decorator;

public class CoquetelComRefri extends CoquetelDecorator {

	public CoquetelComRefri(Coquetel meuCoquetel) {
		super(meuCoquetel);
		System.out.println("Adicionando refri...");
		nome = "refri";
		preco = 2;
	}
	
	public String getNome() {
		return super.getNome() + " com " + nome;
	}
	public double getPreco() {
		return super.getPreco() + preco;
	}

	
}
