package one.digitalinnovation.List.Pesquisa;

public class LivroMain {
    public static void main(String[] args) {
        CatalogosLivros catalogo = new CatalogosLivros();

        // ADICIONANDO COISAS EM MINHA LISTA;
        catalogo.adicionarLivro("JOAO", "JOAO", 2026);
        catalogo.adicionarLivro("MARIA FERNANDA", "MARIA FERNANDA", 2022);


        catalogo.MostrarDetalhes();

        // PESQUISANDO POR TITULO;
        System.out.println(catalogo.pesquisaPortitulo("JOAO"));
        System.out.println(catalogo.pesquisaPorAno(2022, 2027));





    }
}
