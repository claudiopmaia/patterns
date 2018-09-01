package br.uece.ps.decorator;

public class IogurteBanana implements Iogurte {
	
	private double custo = 5.00;
	private String descricao = "Iogurte de banana";
	private String produto = "Iogurte de banana";

	@Override
	public double getCusto() {
		return custo;
	}

	@Override
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String getProdutos() {
		return produto;
	}

}
