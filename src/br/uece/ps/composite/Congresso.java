package br.uece.ps.composite;

import java.util.ArrayList;
import java.util.List;

public class Congresso {
	
	private int quantidade;
	private int lotacao;
	private List<Congresso> participantes; 
	
	public Congresso() {
		this.lotacao = 3;
		participantes = new ArrayList<>();
	}
	
	public void inscrever(Congresso participante) {
		if(quantidade != lotacao) {
			participantes.add(participante);
			quantidade++;
		} else {
			System.out.println("N�o � mais poss�vel inscrever participantes");
		}
	}
	
	public void imprimirParticipantes() {
		for(Congresso participante : participantes) {
			if(participante instanceof Individuo) {
				System.out.println("Individuo");
			}else {
				System.out.println("Institui��o");
			}
		}
	}
}
