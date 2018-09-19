package br.uece.ees.factory;

public class FabricaFiat {

	private static FabricaFiat fabrica = null;
	
	protected FabricaFiat(){
		
	}
	
	public static FabricaFiat getFabrica(){
		if (fabrica == null)
			fabrica = new FabricaFiat();
		
		return fabrica;
	}
	
	public Carro getCarro (String marca){
		Carro c = null;
		switch(marca){
			case "Palio": c= new Palio(); break;
			case "Siena": c =new Siena(); break;
			case "Uno"  : c =new Uno(); break;
		}
		
		return c;
	}
}
