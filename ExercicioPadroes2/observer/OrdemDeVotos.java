package br.uece.ees.observer;

public class OrdemDeVotos extends BDObserver {

	private double candA;
	private double candB;
	private double candC;
	protected BancoDeDados bd;
	
	public OrdemDeVotos(BancoDeDados bd){
		this.bd=bd;
	}
	
	@Override
	public void atualizar() {
		candA = bd.getCandA();
		candB = bd.getCandB();
		candC = bd.getCandC();
	}

	@Override
	public void mostrarResultados() {
		System.out.println("Resultado por ordem de votação:");
		if ((candA > candB) && (candA > candC)){
			System.out.println("Primeiro colocado - CandA: " + candA);
			if (candB > candC){
				System.out.println("Segundo colocado - CandB: " + candB);
				System.out.println("Terceiro colocado - CandC: " + candC);
			} else {
				System.out.println("Segundo colocado - CandC: " + candC);
				System.out.println("Terceiro colocado - CandB: " + candB);
			}
		}
		else
			if ((candB > candA) && (candB > candC)){
				System.out.println("Primeiro colocado - CandB: " + candB);
				if (candA > candC){
					System.out.println("Segundo colocado - CandA: " + candA);
					System.out.println("Terceiro colocado - CandC: " + candC);
				} else {
					System.out.println("Segundo colocado - CandC: " + candC);
					System.out.println("Terceiro colocado - CandA: " + candA);
				}
			} 
			else {
					System.out.println("Primeiro colocado - CandC: " + candC);
					if (candB > candA){
						System.out.println("Segundo colocado - CandB: " + candB);
						System.out.println("Terceiro colocado - CandA: " + candA);
					} else {
						System.out.println("Segundo colocado - CandA: " + candA);
						System.out.println("Terceiro colocado - CandB: " + candB);
					}
				
			}
		System.out.println("====================");
	}

}
