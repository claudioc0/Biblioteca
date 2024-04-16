//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
        Ebook ebook2 = new Ebook("Crime e Castigo", " Fiódor Dostoiévski");
        VideoDigital video1 = new VideoDigital("A Ciência da Felicidade", "Laurie Santos");
        VideoDigital video2 = new VideoDigital("O Poder da Vulnerabilidade", "Brené Brown");

        ebook1.descricao();
        ebook2.descricao();
        video1.descricao();
        video2.descricao();

        ebook1.baixar();
        ebook2.baixar();
        video1.visualizar();
        video2.visualizar();
    }
}
