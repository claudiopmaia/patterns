package br.uece.ees.bridge;

public class DAO {

	private Persistencia p;
	
	public DAO(Persistencia persist){
		this.p = persist;
	}
	
	public void salvar(String s){
		p.salvar(s);
	}
	
	
}
