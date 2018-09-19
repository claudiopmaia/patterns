package br.uece.ees.decorator;

public class CoquetelComLimao extends CoquetelDecorator {

	public CoquetelComLimao(Coquetel meuCoquetel) {
		super(meuCoquetel);
		System.out.println("Adicionando limão...");
		nome = "limao";
		preco = 1.2;		
	}

	public String getNome() {
		return super.getNome() + " com " + nome;
	}
	public double getPreco() {
		return super.getPreco() + preco;
	}
}
