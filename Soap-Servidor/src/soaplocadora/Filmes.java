package soaplocadora;

//import java.util.Objects;

public class Filmes {
    private Long codigo;
    private String titulo;
    private String anoLancamento;
    private String idioma;
    private String genero;
    private String sinopse;
    
    /** Construtor vazio  **/
    public Filmes(){
        
    }
    
    public Filmes(Long codigo, String titulo, String anoLancamento, String idioma, String genero, String sinopse){
        super();
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.idioma = idioma;
        this.genero = genero;
        this.sinopse = sinopse;
        
    }
    public Long getCodigo(){
        return codigo;
    }
    public void setCodigo(Long codigo){
        this.codigo = codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAnoLancamento(){
        return anoLancamento;
    }
    public void setAnoLancamento(String anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    public String getIdioma(){
        return idioma;
    }
    public void setIdioma(String idioma){
        this.idioma = idioma;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getSinopse(){
        return sinopse;
    }
    public void setSinopse(String sinopse){
        this.sinopse = sinopse;
    }
    
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
         Filmes other = (Filmes) obj;
        if (codigo == null){
            if (other.codigo != null){
                return false;
            }
        } else if(!codigo.equals(other.codigo)){
            return false;
        }
        return true;
    }
}

   

    
