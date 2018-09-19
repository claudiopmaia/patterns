package br.uece.ees.proxy;

public class Cliente {

	public static void main(String[] args) {
		Imagem imagem1 = new ImagemProxy("Foto1.jpeg");
        Imagem imagem2 = new ImagemProxy("Foto2.jpeg");
 
        imagem1.mostrarImagem(); // é necessário o carregamento
        imagem1.mostrarImagem(); // não é necessário o carregamento
        System.out.println("---------------------");
        
        imagem2.mostrarImagem(); // é necessário o carregamento
        imagem2.mostrarImagem(); // não é necessário o carregamento
        System.out.println("---------------------");
        
        imagem2.mostrarImagem(); // não é necessário o carregamento
        imagem1.mostrarImagem(); // não é necessário o carregamento

	}

}
