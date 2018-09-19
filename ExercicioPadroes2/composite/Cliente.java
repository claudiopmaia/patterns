package br.uece.ees.composite;

public class Cliente {

	public static void main(String[] args) {
		DVD dvd1 = new DVD("Paralamas 30 anos", "Paralamas do sucesso", 20);
		DVD dvd2 = new DVD("Vamo bater lata", "Paralamas do sucesso", 10);
		DVD dvd3 = new DVD("Paralamas Ao vivo", "Paralamas do sucesso", 15);
		CD cd1 = new CD("Dois", "Legiao Urbana", 26);
		CD cd2 = new CD ("Acústico MTV", "Capital Inicial", 18);
		
		Box box1 = new Box("Coletânea Paralamas", "Paralamas do sucesso",35);
		box1.adicionarItem(dvd1);
		box1.adicionarItem(dvd2);
		box1.adicionarItem(dvd3);
		
		/* Carrinho de compra */
		double total = box1.getPreco() + cd1.getPreco() + cd2.getPreco();
		
		box1.mostrarDados();
		cd1.mostrarDados();
		cd2.mostrarDados();
		
		System.out.println("Valor total = R$" + total);
		

	}

}
