package br.uece.ees.observer;

import java.util.ArrayList;

public abstract class BancoDeDados {

	protected int candA;
	protected int candB;
	protected int candC;
	
	protected ArrayList<BDObserver> observadores = new ArrayList<BDObserver>();
	
	
	public void notificar(){
		for (BDObserver obs: observadores)
			obs.atualizar();
	}
	
	public void adicionarObservador(BDObserver o){
		observadores.add(o);
	}
	public void removerObservador(BDObserver o){
		observadores.remove(o);
	}

	public abstract void setValores(int a, int b, int c);
	
	public int getCandA() {
		return candA;
	}

	public int getCandB() {
		return candB;
	}

	public int getCandC() {
		return candC;
	}
}
