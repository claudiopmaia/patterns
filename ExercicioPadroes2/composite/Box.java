package br.uece.ees.composite;

import java.util.ArrayList;

public class Box extends Item {

	private ArrayList<Item> itens = new ArrayList<Item>();
	
	public Box(String nome, String artista, double preco){
		super(nome,artista,preco);
	}
	
	public void adicionarItem(Item i){
		itens.add(i);
	}
	
	public void removerItem(Item i){
		if (itens.contains(i)){
			itens.remove(i);
		}
		else {
			System.out.println("Item n�o consta na lista");
		}
	}
	
	public void getItem(Item i){
		System.out.println("N�o � poss�vel retornar item");
	}
	
	public void mostrarDados(){
		super.mostrarDados();
		System.out.println("Este box cont�m: ");
		for (Item i: itens){
			System.out.println("============");
			i.mostrarDados();
		}
	}
}
