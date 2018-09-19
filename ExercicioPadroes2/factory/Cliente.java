package br.uece.ees.factory;

public class Cliente {

	public static void main(String args[]){
	
		FabricaFiat f = FabricaFiat.getFabrica();
		Carro c = f.getCarro("Uno");
		c.mostraDescricao();
		c.mostraPreco();
	}
}
