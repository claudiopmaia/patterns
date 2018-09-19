package br.uece.ees.composite;

public class Item {

	private String nome;
	private String artista;
	private double preco;
	
	public Item(String nome, String artista, double preco){
		this.nome = nome;
		this.artista = artista; 
		this.setPreco(preco);
	}
	
	public void adicionarItem(Item i){
		System.out.println("Item não pode ser adicionado");
	}
	
	public void removerItem(Item i){
		System.out.println("Item não pode ser removido");
	}
	
	public void getItem(Item i){
		System.out.println("Não é possível retornar item");
	}
	
	public void mostrarDados(){
		System.out.println("Nome: " + nome);
		System.out.println("Artista: " + artista);
		
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
