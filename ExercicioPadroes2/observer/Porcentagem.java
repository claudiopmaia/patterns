package br.uece.ees.observer;

public class Porcentagem extends BDObserver {

	private double candA;
	private double candB;
	private double candC;
	protected BancoDeDados bd;
	
	public Porcentagem(BancoDeDados bd){
		this.bd = bd;
	}
	@Override
	public void atualizar() {
		double total = bd.getCandA() + bd.getCandB() + bd.getCandC();
		candA = (bd.getCandA()/total)*100;
		candB = (bd.getCandB()/total)*100;
		candC = (bd.getCandC()/total)*100;
	}

	public void mostrarResultados(){
		System.out.println("Candidato A = " + candA + "% dos votos");
		System.out.println("Candidato B = " + candB + "% dos votos");
		System.out.println("Candidato C = " + candC + "% dos votos");
		System.out.println("====================");
	}
}
