package br.uece.ees.facade;

public class SubSistemaClima {

	public String verificaTempo(double temp){
		if (temp < 10){
			System.out.println("Tempatura muito fria");
			return "frio";
		}else if (temp < 25){
				System.out.println("Temperatura amena");
				return "ameno";
			}else {
				System.out.println("Temperatura quente");
				return "quente";
				}
	}
}
