package br.uece.ees.adapter;

public class PersistenciaAdapter implements Persistencia {

	private String id;
	
	public PersistenciaAdapter(String id){
		this.id = id;
	}
	
	@Override
	public boolean salvar(String arquivo) {
		Amazon amazon = new Amazon();
		return amazon.store(id,arquivo);
	}

}
