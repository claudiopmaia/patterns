package br.uece.ees.facade;

public class SubSistemaTemperatura {

	public double converte(int f){
		double c = (f-32)/1.8;
		System.out.println("Temperatura em celsius: " + c + " graus");
		return c;
	}
}
