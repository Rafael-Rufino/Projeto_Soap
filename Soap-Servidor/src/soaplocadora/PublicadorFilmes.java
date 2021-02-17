package soaplocadora;

import soaplocadora.PublicadorFilmes;
import javax.xml.ws.Endpoint;


public class PublicadorFilmes {
    
    public static void main(String[] args){
        Endpoint.publish("http://localhost:9876/Filmes/", new ServicoFilme());
    
    }


}
   
        

 
            
 




