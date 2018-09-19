package br.uece.ees.decorator;

public class CoquetelComGelo extends CoquetelDecorator {

	public CoquetelComGelo(Coquetel meuCoquetel) {
		super(meuCoquetel);
		System.out.println("Adicionando gelo...");
		nome = "gelo";
		preco= 0.8;
	}

	public String getNome() {
		return super.getNome() + " com " + nome;
	}
	public double getPreco() {
		return super.getPreco() + preco;
	}
}
