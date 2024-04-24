import java.util.List;
import java.util.ArrayList;

public abstract class ItemBibliotecaDigital {
    protected String titulo;
    protected String autor;
    protected List<ItemBibliotecaDigital> acervo = new ArrayList<ItemBibliotecaDigital>();


    public ItemBibliotecaDigital(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract String descricao();

    public void adicionarLivro(ItemBibliotecaDigital item){
        acervo.add(item);
    }
}
