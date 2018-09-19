package br.uece.ees.chain;

public abstract class CentroChain {

	protected CentroChain next;
	protected String nome;
	
	public CentroChain(){
		next=null;
	}
	
	public void setNext(CentroChain c){
		if (next==null)
			next=c;
		else
			next.setNext(c);
	}
	
	public void receber(String doc, String nomeCentro){
		if (nome.equals(nomeCentro)){
			this.confirmar(doc);
		}
		else{
			if (next==null)
				System.out.println("Centro inexistente");
			else {
				System.out.println(nome + " não pode receber o processo");
				next.receber(doc, nomeCentro);
			}
		}
			
	}

	public abstract void confirmar(String doc);
	
}
