package soaplocadora;

import java.util.List;
import javax.jws.WebService;


@WebService(endpointInterface = "soaplocadora.InterfaceFilme")
public class ServicoFilme implements InterfaceFilme {
    
    private FilmeLocadora filmeLocadora = new FilmeLocadora();// objeto de acesso aos dados
 
    @Override
    public List<Filmes> retornaFilmes() {
        System.out.println("Retornar filmes foi acessado!");
        return filmeLocadora.listaFilmes();
    }

    @Override
    public void insereFilme(String titulo, String anoLancamento, String idioma, String genero, String sinopse) {
        System.out.println("Inserir filmes foi acessado!");
        filmeLocadora.insereFilmes(titulo, anoLancamento, idioma, genero, sinopse);     
    }   
}
