package br.uece.ees.proxy;

public class Cliente {

	public static void main(String[] args) {
		Imagem imagem1 = new ImagemProxy("Foto1.jpeg");
        Imagem imagem2 = new ImagemProxy("Foto2.jpeg");
 
        imagem1.mostrarImagem(); // � necess�rio o carregamento
        imagem1.mostrarImagem(); // n�o � necess�rio o carregamento
        System.out.println("---------------------");
        
        imagem2.mostrarImagem(); // � necess�rio o carregamento
        imagem2.mostrarImagem(); // n�o � necess�rio o carregamento
        System.out.println("---------------------");
        
        imagem2.mostrarImagem(); // n�o � necess�rio o carregamento
        imagem1.mostrarImagem(); // n�o � necess�rio o carregamento

	}

}
