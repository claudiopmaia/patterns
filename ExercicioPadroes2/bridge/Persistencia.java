package br.uece.ees.bridge;

public interface Persistencia {

	public void salvar(Object o);
	public Object recuperar(int id);
	public void deletar(int id);
}
