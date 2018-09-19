package br.uece.ees.facade;

public class Facade {

	SubSistemaTemperatura subTemp = new SubSistemaTemperatura();
	SubSistemaClima subClima = new SubSistemaClima();
	SubSistemaModa subModa = new SubSistemaModa();
	
	public void dicaDeModa(int tempF){
		double tempC = subTemp.converte(tempF);
		String clima = subClima.verificaTempo(tempC);
		subModa.mostrarDicaModa(clima);
	}
}
