public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel{
    public VideoDigital(String titulo, String autor){
        super(titulo, autor);
    }
    @Override
    public void descricao(){
        System.out.println("Vídeo: " + titulo + " - Autor: " + autor);
    }

    @Override
    public void baixar(){
        System.out.println("Baixando o vídeo: " + titulo);
    }

    @Override
    public void visualizar(){
        System.out.println("Visualizando o vídeo: " + titulo);
    }
}
