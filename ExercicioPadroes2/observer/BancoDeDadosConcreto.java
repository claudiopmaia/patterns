package br.uece.ees.observer;

public class BancoDeDadosConcreto extends BancoDeDados {
	
	public BancoDeDadosConcreto(){
		candA = 0;
		candB = 0;
		candC = 0;
	}
	
	
	public void setValores(int a, int b, int c){
		candA = a;
		candB = b;
		candC = c;
		notificar();
	}

	
}
