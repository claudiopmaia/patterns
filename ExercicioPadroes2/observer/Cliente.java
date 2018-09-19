package br.uece.ees.observer;

public class Cliente {

	public static void main(String args[]){
		
		BancoDeDados bdc = new BancoDeDadosConcreto();
		BDObserver porc = new Porcentagem(bdc);
		BDObserver ordem = new OrdemDeVotos(bdc);
		
		bdc.adicionarObservador(porc);
		bdc.adicionarObservador(ordem);
		
		bdc.setValores(2, 4, 9);
		porc.mostrarResultados();
		ordem.mostrarResultados();
		
		bdc.setValores(5, 14, 9);
		porc.mostrarResultados();
		ordem.mostrarResultados();
	}
}
