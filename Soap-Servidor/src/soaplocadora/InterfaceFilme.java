package soaplocadora;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;


@WebService
public interface InterfaceFilme {
    
    /* Métodos do webService*/
    @WebMethod
    public List<Filmes> retornaFilmes();
    
    @WebMethod
    public void insereFilme(String titulo, String anoLancamento, String idioma, String genero, String sinopse);
}

    



