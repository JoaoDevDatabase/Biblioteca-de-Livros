package one.digitalinnovation.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogosLivros {
    private List<Livro> livroList;

    public CatalogosLivros() {
        this.livroList = new ArrayList<>();
    }

 
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        this.livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){

        }
        for (Livro l : livroList){
            if (l.getAutor().equalsIgnoreCase(autor)){
                livroPorAutor.add(l);
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisaPorAno(int anoinicio, int anofinal){
        List<Livro> pesquisaPorano = new ArrayList<>();

        if(!livroList.isEmpty()){

        }
        for ( Livro l : livroList){
            if (l.getAnoPublicacao() >= anoinicio && l.getAnoPublicacao() <= anofinal ){
                pesquisaPorano.add(l);
            }
        }
        return pesquisaPorano;
    }

    public Livro pesquisaPortitulo(String titulo) {
        Livro pesquisatitulo = null;
        if (!livroList.isEmpty()){

        }
        for (Livro l : livroList){
            if (l.getTitulo().equalsIgnoreCase(titulo)){
                pesquisatitulo = l;
            }
            break;
        }
        return pesquisatitulo;
    }

    public void MostrarDetalhes(){
        String strRetorno = "";
         if (!livroList.isEmpty()){
             System.out.println(livroList);
         } else {
             System.out.println("lista vazia");
         }
    }
}
