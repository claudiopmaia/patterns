package br.uece.ees.chain;

public class Cliente {

	public static void main(String[] args) {
		CentroChain protocolo = new Protocolo();
		protocolo.setNext(new CentroCiencias());
		protocolo.setNext(new CentroSaude());
		protocolo.setNext(new CentroTecnologia());
		
		protocolo.receber("processoB.doc", "Centro de Veterinária");
		//protocolo.receber("processoA.doc", "Centro de Tecnologia");
		
	}

}
