package br.uece.ees.bridge;

public class PersistenciaEmArquivo implements Persistencia {

	@Override
	public void salvar(Object o) {
		System.out.println("Salvando o objeto na pasta");

	}

	@Override
	public Object recuperar(int id) {
		System.out.println("Recureando objeto id = " + id);
		return new Object();
	}

	@Override
	public void deletar(int id) {
		System.out.println("Deletando objeto id = " + id);

	}

}
