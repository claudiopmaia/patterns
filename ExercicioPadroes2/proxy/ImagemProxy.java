package br.uece.ees.proxy;

public class ImagemProxy implements Imagem {

	private String local = "\\AmazonServer\\images\\";
	private String nomeDoArquivo;
    private Imagem imagem;
 
    public ImagemProxy(String nomeDoArquivo) {
        this.nomeDoArquivo = local+nomeDoArquivo;
    }
    public void mostrarImagem() {
        if(imagem == null)
          imagem = new ImagemReal(nomeDoArquivo);
        imagem.mostrarImagem();
    }

}
