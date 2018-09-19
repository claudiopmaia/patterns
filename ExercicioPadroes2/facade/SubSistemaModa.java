package br.uece.ees.facade;

public class SubSistemaModa {

	public void mostrarDicaModa(String tempo){
		if (tempo.equals("frio"))
			System.out.println("Usar cachecol, casaco e roupas quentes");
		else
			if (tempo.equals("ameno"))
				System.out.println("Usar jeans e blusa de manga comprida ");
			else
				System.out.println("Usar roupas leves e curtas");
	}
}
