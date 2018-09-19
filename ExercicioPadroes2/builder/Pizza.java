package br.uece.ees.builder;

import java.util.ArrayList;

public class Pizza {

	private double preco;
	private ArrayList<String> ingredientes = new ArrayList<String>();
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public void addIngrediente(String ing){
		ingredientes.add(ing);
	}
	
	public void mostrarDados(){
		System.out.println("Ingredientes:");
		for (String ing: ingredientes)
			System.out.println(ing);
		System.out.println("Preço: " + preco);
	}
}
