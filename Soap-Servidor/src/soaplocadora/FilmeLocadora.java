package soaplocadora;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


public class FilmeLocadora {
    
    private static Map<Long, Filmes> Filmes = new LinkedHashMap<>();
    private static Long contador;
    
    public FilmeLocadora(){
        contador = 0L;// contador para gera o codigo do banco de dados
    }
    
    public ArrayList<Filmes> listaFilmes(){
        return new ArrayList<>(Filmes.values());//arrayList com os valores
    }
    
   public void insereFilmes(String titulo, String anoLancamento, String idioma, String genero, String sinopse) {
        contador += 1L;
        Filmes.put(contador, new Filmes(contador, titulo, anoLancamento, idioma, genero,sinopse));
    }
}