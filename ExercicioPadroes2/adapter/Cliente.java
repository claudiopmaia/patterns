package br.uece.ees.adapter;

public class Cliente {

	public static void main(String[] args) {
		String arquivo = "meuArquivo.txt";
		Persistencia p = new PersistenciaAdapter("pauloh");
		if (p.salvar(arquivo))
			System.out.println("Arquivo salvo com sucesso");
		else
			System.out.println("Erro ao salvar arquivo");

	}

}
